# Parking Lot System

Hey there! I've implemented the Parking Lot system based on the UML diagram provided. It's written in Java and kept very straightforward and easy to read.

```mermaid
classDiagram
    class ParkingLot {
        -List~Slot~ slots
        -List~Ticket~ tickets
        -List~Vehicle~ vehicles
        +createSlot() : void
        +parkVehicle(Vehicle) : Ticket
        +exitVehicle(Ticket) : double
        +getAvailableSlots() : int
    }

    class Ticket {
        -int ticketId
        -String entryTime
        -SlotType type
        -String slotId
        -String vehicleDetails
        +calcFare() : double
    }

    class Slot {
        -int slotId
        -SlotType type
        -boolean isAvailable
        +isAvailable() : boolean
        +assignVehicle(Vehicle) : void
        +removeVehicle() : void
    }

    class Vehicle {
        -String vehicleId
        -String entryTime
        -String slotId
        +getVehicleDetails() : String
    }

    class Fare {
        -SlotType type
        +calculateFare(Ticket) : double
    }

    class SlotType {
        <<enumeration>>
        SMALL
        MEDIUM
        LARGE
    }

    ParkingLot "1" --> "many" Slot
    ParkingLot "1" --> "many" Ticket
    ParkingLot "1" --> "many" Vehicle
    Ticket "1" --> "1" Slot
    Ticket "many" --> "1" Vehicle
    Ticket "1" --> "1" SlotType
    Slot "1" --> "1" SlotType
    Fare "1" --> "1" SlotType
```

## What's Included

- **ParkingLot**: The main class that ties everything together. It handles creating slots, parking vehicles, and managing exits.
- **Slot**: Represents individual parking spaces.
- **SlotType**: An enumeration for the different sizes of slots (SMALL, MEDIUM, LARGE).
- **Vehicle**: Holds the details of a vehicle being parked.
- **Ticket**: Generated when a vehicle successfully parks.
- **Fare**: Calculates the amount to pay when a vehicle exits, based on the slot type.

## How It Works

1. Create a `ParkingLot` instance and add some `Slot`s to it using `createSlot()`.
2. When a car arrives, create a `Vehicle` instance and call `parkVehicle()`. It will find an available slot, assign the vehicle to it, and return a `Ticket`.
3. When the car is ready to leave, pass the `Ticket` to `exitVehicle()`. It frees up the slot and calculates the total fare.

Everything is in the `ParkingLot` folder, ready to use! Enjoy!

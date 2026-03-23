package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Slot> slots;
    private List<Ticket> tickets;
    private List<Vehicle> vehicles;
    private int ticketCounter = 1;

    public ParkingLot() {
        this.slots = new ArrayList<>();
        this.tickets = new ArrayList<>();
        this.vehicles = new ArrayList<>();
    }

    public void createSlot(int slotId, SlotType type) {
        slots.add(new Slot(slotId, type));
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (Slot slot : slots) {
            if (slot.isAvailable()) {
                slot.assignVehicle(vehicle);
                vehicle.setSlotId(String.valueOf(slot.getSlotId()));
                vehicle.setEntryTime("10:00 AM");

                Ticket ticket = new Ticket(
                        ticketCounter++,
                        vehicle.getEntryTime(),
                        slot.getType(),
                        String.valueOf(slot.getSlotId()),
                        vehicle.getVehicleDetails());

                tickets.add(ticket);
                vehicles.add(vehicle);

                return ticket;
            }
        }
        return null;
    }

    public double exitVehicle(Ticket ticket) {
        for (Slot slot : slots) {
            if (String.valueOf(slot.getSlotId()).equals(ticket.getSlotId())) {
                slot.removeVehicle();
                break;
            }
        }
        return ticket.calcFare();
    }

    public int getAvailableSlots() {
        int count = 0;
        for (Slot slot : slots) {
            if (slot.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}

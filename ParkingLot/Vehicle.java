package ParkingLot;

public class Vehicle {
    private String vehicleId;
    private String entryTime;
    private String slotId;

    public Vehicle(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleDetails() {
        return "VehicleID: " + vehicleId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    public String getSlotId() {
        return slotId;
    }

    public void setSlotId(String slotId) {
        this.slotId = slotId;
    }
}

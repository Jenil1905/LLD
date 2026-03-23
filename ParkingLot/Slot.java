package ParkingLot;

public class Slot {
    private int slotId;
    private SlotType type;
    private boolean isAvailable;

    public Slot(int slotId, SlotType type) {
        this.slotId = slotId;
        this.type = type;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void assignVehicle(Vehicle vehicle) {
        this.isAvailable = false;
    }

    public void removeVehicle() {
        this.isAvailable = true;
    }

    public int getSlotId() {
        return slotId;
    }

    public SlotType getType() {
        return type;
    }
}

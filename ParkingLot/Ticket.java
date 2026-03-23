package ParkingLot;

public class Ticket {
    private int ticketId;
    private String entryTime;
    private SlotType type;
    private String slotId;
    private String vehicleDetails;

    public Ticket(int ticketId, String entryTime, SlotType type, String slotId, String vehicleDetails) {
        this.ticketId = ticketId;
        this.entryTime = entryTime;
        this.type = type;
        this.slotId = slotId;
        this.vehicleDetails = vehicleDetails;
    }

    public double calcFare() {
        Fare fare = new Fare(type);
        return fare.calculateFare(this);
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public SlotType getType() {
        return type;
    }

    public String getSlotId() {
        return slotId;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }
}

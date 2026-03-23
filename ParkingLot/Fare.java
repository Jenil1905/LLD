package ParkingLot;

public class Fare {
    private SlotType type;

    public Fare(SlotType type) {
        this.type = type;
    }

    public double calculateFare(Ticket ticket) {
        if (type == SlotType.SMALL) {
            return 50.0;
        } else if (type == SlotType.MEDIUM) {
            return 100.0;
        } else {
            return 150.0;
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Hostel Fee Calculator ===");
        // BookingRequest req = new BookingRequest(LegacyRoomTypes.DOUBLE, List.of(AddOn.LAUNDRY, AddOn.MESS));
        roomType rt = new doubleRoom();
        List<addOnType> addOns = List.of(
            new laundary(),
            new messAddOn()
        );
        BookingRequest req = new BookingRequest(rt, addOns);
        HostelFeeCalculator calc = new HostelFeeCalculator(new FakeBookingRepo());
        calc.process(req);
    }
}

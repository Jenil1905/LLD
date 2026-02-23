import java.util.*;

public class BookingRequest {
    // public final int roomType;
    public roomType rt;
    public final List<addOnType> addOns;

    public BookingRequest(roomType rt, List<addOnType> addOns) {
        this.rt = rt;
        this.addOns = addOns;
    }
}

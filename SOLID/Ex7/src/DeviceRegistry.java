import java.util.*;

public class DeviceRegistry {
    // private final java.util.List<SmartClassroomDevice> devices = new ArrayList<>();

    // private final java.util.List<SmartClassroomDevice> devices = new ArrayList<>();
     private final java.util.List<Object> devices = new ArrayList<>();

    public void add(Object d) { devices.add(d); }

    // public SmartClassroomDevice getFirstOfType(String simpleName) {
    //     for (SmartClassroomDevice d : devices) {
    //         if (d.getClass().getSimpleName().equals(simpleName)) return d;
    //     }
    //     throw new IllegalStateException("Missing: " + simpleName);
    // }
    public <T> T getFirstOfType(Class<T> type) {
        for (Object d : devices) {
            if (type.isInstance(d)) return type.cast(d);
        }
        throw new IllegalStateException("Missing: " + type.getSimpleName());
    }
}

public class ClassroomController {
    private final DeviceRegistry reg;

    public ClassroomController(DeviceRegistry reg) { this.reg = reg; }

    public void startClass() {
        // SmartClassroomDevice pj = reg.getFirstOfType("Projector");
         Projector pj = reg.getFirstOfType(Projector.class);
        pj.powerOn();
        ConnectInput ci = reg.getFirstOfType(ConnectInput.class);
        ci.connectInput("HDMI-1");

        // SmartClassroomDevice lights = reg.getFirstOfType("LightsPanel");
        Brightness lights = reg.getFirstOfType(Brightness.class);
        lights.setBrightness(60);

        // SmartClassroomDevice ac = reg.getFirstOfType("AirConditioner");
        Temerature ac = reg.getFirstOfType(Temerature.class);
        ac.setTemperatureC(24);

        // SmartClassroomDevice scan = reg.getFirstOfType("AttendanceScanner");

        Attendance scan = reg.getFirstOfType(Attendance.class);
        System.out.println("Attendance scanned: present=" + scan.scanAttendance());
    }

    // public void endClass() {
    //     System.out.println("Shutdown sequence:");
    //     reg.getFirstOfType("Projector").powerOff();
    //     reg.getFirstOfType("LightsPanel").powerOff();
    //     reg.getFirstOfType("AirConditioner").powerOff();
    // }
    public void endClass() {
        System.out.println("Shutdown sequence:");
        reg.getFirstOfType(Projector.class).powerOff();
        reg.getFirstOfType(LightsPanel.class).powerOff();
        reg.getFirstOfType(AirConditioner.class).powerOff();
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Placement Eligibility ===");
        StudentProfile s = new StudentProfile("23BCS1001", "Ayaan", 8.10, 72, 18, LegacyFlags.NONE);
        List<Eligibility> rules = new ArrayList<>();
        Eligibility credits = new Credits();
        Eligibility attentance = new Attendance();
        Eligibility cgr = new CGR();
        Eligibility discipline = new Discipline();
        rules.add(credits);
        rules.add(attentance);
        rules.add(cgr);
        rules.add(discipline);
        EligibilityEngine engine = new EligibilityEngine(new FakeEligibilityStore(),rules);
        engine.runAndPrint(s);
    }
}

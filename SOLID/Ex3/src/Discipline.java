import java.util.ArrayList;
import java.util.List;

public class Discipline implements Eligibility{
    
@Override
    public List<String> check(StudentProfile s){
        List<String> reasons = new ArrayList<>();
        if(s.disciplinaryFlag!=LegacyFlags.NONE){
            reasons.add("disciplinary flag present");
        }

        return reasons;
    }
}

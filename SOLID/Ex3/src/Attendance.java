import java.util.ArrayList;
import java.util.List;

public class Attendance implements Eligibility {
   
    @Override
    public List<String> check(StudentProfile s){
       List<String> reasons = new ArrayList<>();
        if(s.attendancePct<75){
           reasons.add("attendance below 75");
        }
        return reasons;
    }
}

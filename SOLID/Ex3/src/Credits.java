import java.util.ArrayList;
import java.util.List;

public class Credits implements Eligibility {
   
    @Override
    public List<String> check(StudentProfile s){
         List<String> reasons = new ArrayList<>();
        if(s.earnedCredits < 20){
           reasons.add("credits below 20");
        }
        return reasons;
    }
}

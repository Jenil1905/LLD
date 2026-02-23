import java.util.ArrayList;
import java.util.List;

public class CGR implements Eligibility{
   @Override
    public List<String> check(StudentProfile s){
       List<String> reasons = new ArrayList<>();
       if(s.cgr<8.0){
        reasons.add("CGR below 8.0");
       }
        return reasons;
    }
}

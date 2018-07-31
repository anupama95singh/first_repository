import java.util.Comparator;
import java.util.Date;

public class CompByTime implements Comparator<Patient> {
	 @Override
	 public int compare(Patient o1, Patient o2) {
	      return o1.time.compareTo(o2.time);
	    }
}

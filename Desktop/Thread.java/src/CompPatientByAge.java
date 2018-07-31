import java.util.Comparator;
public class CompPatientByAge implements Comparator<Patient>{
	 @Override
	    public int compare(Patient o1, Patient o2) {
	      if(o1.age>=o2.age) 
	      {
	          return 1;
	      }
	      else
	      {
	          return -1;
	      }
	    }
}

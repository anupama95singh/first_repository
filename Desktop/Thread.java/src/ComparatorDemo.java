
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Date;
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient p1 = new Patient("RAM",21, new Date("02/03/2018"));
        Patient p2 = new Patient("AMIT",25, new Date("03/04/2018"));
        Patient p3 = new Patient("SANJAY",18, new Date("05/02/2018"));
        List<Patient> list = new ArrayList<Patient>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("...before sort....");
        for(Patient p: list){
            System.out.print(p.name+" "+p.age+" "+p.time);
        }
        System.out.println("\n...after sort by name....");
        Collections.sort(list, new ComPatientByName());
        for(Patient p: list){
            System.out.print(p.name+" "+p.age+" "+p.time);
        }
        System.out.println("\n...after sort by age....");
        Collections.sort(list, new CompPatientByAge());
        for(Patient p: list){
            System.out.print(p.name+" "+p.age+" "+p.time);
        }
        Collections.sort(list, new CompByTime());
        for(Patient p: list){
            System.out.print(p.name+" "+p.age+" "+p.time);
        }
    }
	

}


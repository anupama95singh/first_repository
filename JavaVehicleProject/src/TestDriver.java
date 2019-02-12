class Driver{
	String name;
	String vehicle;
	int learningLicenseNo;
	String address;
	
    void driverRecord(String n, String v, int ll, String a) {
    	name = n;
    	vehicle = v;
    	learningLicenseNo = ll;
    	address = a;
    }
    void display() {
    	System.out.println(name +" "+vehicle +" "+learningLicenseNo+" "+address);
    }
}

class Vehicle extends Driver{
	int a,b;
	
 	
}
class TwoWheeler extends Vehicle {
	private int accelerationControl;
	private int brakeControl;
	private int gearControl;
	private int speedLimit;
	public int getAccelerationControl() {
		if(accelerationControl>2) {
			return accelerationControl;
		}
		else {
			return 0;
		}
	}
	public void setAccelerationControl(int accelerationControl) {
		this.accelerationControl = accelerationControl;
	}
	public int getBrakeControl() {
		if(brakeControl>2) {
			return brakeControl;
		}
		else {
			return 0;
		}
	}
	public void setBrakeControl(int brakeControl) {
		this.brakeControl = brakeControl;
	}
	public int getGearControl() {
	
		if(gearControl>2) {
			return gearControl;
		}
		else {
			return 0;
		}	
	}
	public void setGearControl(int gearControl) {
		this.gearControl = gearControl;
	}
	public int getSpeedLimit() {
		if(speedLimit>2) {
			return speedLimit;
		}
		else {
			return 0;
		}
	}
	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}
	
}

class FourWheeler extends Vehicle{
	private int accelerationControl;
	private int brakeControl;
	private int gearControl;
	private int speedLimit;
	
	public int getAccelerationControl() {
		if(accelerationControl>2) {
			return accelerationControl;
		}
		else {
			return 0;
		}
	}
	public void setAccelerationControl(int accelerationControl) {
		this.accelerationControl = accelerationControl;
	}
	public int getBrakeControl() {
		if(brakeControl>2) {
			return brakeControl;
		}
		else {
			return 0;
		}
	}
	public void setBrakeControl(int brakeControl) {
		this.brakeControl = brakeControl;
	}
	public int getGearControl() {
		if(gearControl>2) {
			return gearControl;
		}
		else {
			return 0;
		}	
	}
	public void setGearControl(int gearControl) {
		this.gearControl = gearControl;
	}
	public int getSpeedLimit() {
		if(speedLimit>2) {
			return speedLimit;
		}
		else {
			return 0;
		}
	}
	public void setSpeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}
	
}

public class TestDriver {
	public static void main(String args[]) {
		System.out.println("Hello Java");
		Driver d1 = new Driver();
		Driver d2 = new Driver();
		d1.driverRecord("anu","two-wheeler",100,"banglore");
		d2.driverRecord("mihir","four-wheeler",150,"banglore");
		
		TwoWheeler twoWheeler = new TwoWheeler();
		twoWheeler.setAccelerationControl(5);
		twoWheeler.setBrakeControl(6);
		twoWheeler.setGearControl(8);
		twoWheeler.setSpeedLimit(6);
		FourWheeler fourWheeler = new FourWheeler();
		fourWheeler.setAccelerationControl(5);
		fourWheeler.setBrakeControl(6);
		fourWheeler.setGearControl(8);
		fourWheeler.setSpeedLimit(6);
		
	
		int a = twoWheeler.getAccelerationControl()*twoWheeler.getBrakeControl()*twoWheeler.getGearControl()*twoWheeler.getSpeedLimit();
		
		 if(a>0)
		{
			System.out.println("Two wheeler certificaion passed");
		}
		else {
			System.out.println("Two wheeler certificaion not passed");
		}

		int b=fourWheeler.getAccelerationControl()*fourWheeler.getBrakeControl()*fourWheeler.getGearControl()*fourWheeler.getSpeedLimit();
		
		if(b>0)
		{
			System.out.println("Four wheeler certificaion passed");
		}
		else {
			System.out.println("Four wheeler certificaion not passed");
		}
		
		d1.display();
		d2.display();
		
	}
}

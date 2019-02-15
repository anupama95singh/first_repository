import java.lang.Integer;
public class operator {
		int num1 = 2;
		int num2 = 2;
		
		public void bitwise() {
		 System.out.println("XOR =" +(num1 ^ num2));
		 
		 int num3 = 0b101010;
		 int num4 = 0b010101;
		 
		 int num5 = num3^num4;
		 Integer.toString(num5,2);
		 System.out.println("XOR =" +Integer.toString(num5,2));
}
		
		public void SwitchCase() {
			 int inputDay = 3; 
		        String day; 
		        switch (inputDay) { 
		        case 1: 
		            day = "Monday"; 
		            break; 
		        case 2: 
		            day = "Tuesday"; 
		            break; 
		        case 3: 
		            day = "Wednesday"; 
		            break; 
		        case 4: 
		            day = "Thursday"; 
		            break; 
		        case 5: 
		            day = "Friday"; 
		            break; 
		        case 6: 
		            day = "Saturday"; 
		            break; 
		        case 7: 
		            day = "Sunday"; 
		            break; 
		        default: 
		            day = "it is not any name"; 
		            break; 
		        } 
		        System.out.println(day); 
		}
		
		public void nestedIf() {
			String day = "hey yaa"; 
			if(day=="Monday") {
				System.out.println("Monday"); 
			}
				else if(day=="Tuesday")
				{
					System.out.println("Tuesday"); 
				}
				else {
					System.out.println("No day");
				}
				
			}
		}



public class Ascii {
	public static void main(String[] args) {
		
		operator op = new operator();
		op.bitwise();
		op.SwitchCase();
		op.nestedIf();
			int intArray[];
			intArray = new int[3];
			intArray[0]=2;
			intArray[1]=4;
			intArray[2]=8;
			
			for(int i=0; i<3; i++) {
				System.out.print(intArray[i]);
				System.out.println();
			}
			// 2D array
			int n=19;
			int[][] twoDimArray = new int[n][];
			for(int i=0;i < n;i++ ) {
				twoDimArray[i] = new int[i+1];
			}
			
			for(int i=0; i<twoDimArray.length;i++) {
				for(int j=1; j<=twoDimArray[i].length; j++) {
				
					System.out.print(j+ " ");
				}
				System.out.println();
			}
	}
	
	// 3D array
	 int[][][] arr = {{{1,2,3},{2,3,4}},{{3,4,5},{4,5,6}}};
       for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                   for (int k = 0; k < 2; k++) { 
                        System.out.print(arr[i][j][k] + " "); 
                               } 
                         System.out.println(); 
                            } 
                       System.out.println(); 
                         } 
} 
	}


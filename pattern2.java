
public class pattern2 {
	public static void main(String[] args) {
		for(int x=1;x<=5;x++) {
			for(int y=x;y>=1;y--){
				System.out.print(y);
				 
			}
			
			System.out.println();
		}
		for(int x=5;x>1;x--) {
			for(int y=1;y<=x-1;y++) {
				System.out.print(y);
			}
			System.out.println();
		}
		
		
/*		
		1
		21
		321
		4321
		54321
		1234
		123
		12
		1
*/
		
		/*
 
		for(int x=1;x<=5;x++) {
			for(int y=x;y>=1;y--){
				System.out.print(y);
				 
			}
			
			System.out.println();
		}
		for(int x=1;x<5;x++) {
			for(int y=5;y>x;y--) {
				System.out.print(y);
			}
			System.out.println();
		}
		
	
		1
		21
		321
		4321
		54321
		5432
		543
		54
		5
*/
		
	}

}

 

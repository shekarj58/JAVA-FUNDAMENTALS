
public class pattern3 {
	public static void main(String[] args) {
	for(int x=1;x<=5;x++) {
			for(int y=x;y>=1;y--) {
				if(y!=x&&y!=1) {
					System.out.print(" ");
				}
				else {
					System.out.print(y+" ");
				}
			}
			System.out.println();
		}
	
		
		for(int x=2;x<6;x++) {
			for(int y=5;y>=x;y--) {
				if(y!=x&&y!=5) {
					System.out.print(" ");
				}
				else {
					System.out.print(y+" ");
				}
			}
			System.out.println();
		}
	}

}

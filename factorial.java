import java.util.*;
class fact{
	public static void main(String[] args){
		int num=5,fact=1;
		Scanner sc=new Scanner(System.in);
		int y=sc.nextInt();
		while(y>=1) {
			fact=fact*y;
			y-=1;
			
		}
		System.out.println("factorial using backward tracing "+fact);
		/*fact=1;num=1;
		
		while(num<=5) {
			fact=fact*num;
			num=num+1;
		} 
		System.out.println("factorial using forward tracing "+fact);*/
	}
}
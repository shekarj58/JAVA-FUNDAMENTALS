public class sales {

	public static void main(String[] args) { 
int num=2025,rem1,rev1=0,rev2=0;
int count=0,count1=0,count2=0,temp=num;
 while(num>0) {
	 rem1=num%10;
	 num=num/10;
	 count++;
	 if(count==1||count==2) {
		rev1=rev1*10+rem1;
		count1++;
	 }
	 else {
		 rev2=rev2*10+rem1;
		 count2++;
	 }
	 }
 int x=count1;
 int rem2,rev3=0;
 while(x>0) {
	rem2=rev1%10;
	rev3=rev3*10+rem2;
	rev1/=10;
	x--;
 }
 int y=count2;
 int rem3,rev4=0;
 while(y>0) {
	 rem3=rev2%10;
	 rev4=rev4*10+rem3;
	 rev2/=10;
	 y--;
 }
 int product=(rev3+rev4)*(rev3+rev4);
 System.out.println(product);
 if(product==temp) {
	System.out.println("Special number"); 
 }
 else {
	 System.out.println("not a special number");
 }
		   
}

	 
}

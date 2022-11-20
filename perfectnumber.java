
public class perfectnumber {
	public static void main(String[] args) {
	//int rem,fact=1;
	double sum=0;
	 for(int x=1;x<10000;x++) {
		 int temp=x;
		 sum=0;
		  for(int y=1;y<=x/2;y++) {
			  if(x%y==0) {
				  sum=sum+y;
			  }
			  
		  }
		  x=temp;
		  if(sum==x) {
			 System.out.println(x); 
		  }
		 
		 
	 }
	}
}

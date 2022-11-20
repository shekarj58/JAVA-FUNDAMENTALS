
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,rev=0,temp;
		for(int num=100;num<100000;num++) {
			temp=num;
			rev=0;
			for(;num>0;num/=10) {
				rem=num%10;
				rev=rev*10+rem;
				
			}
			if(temp==rev) {
				System.out.println(temp);
			}
			num=temp;
		}
		
		
	}

}

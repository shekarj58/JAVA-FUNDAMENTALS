
public class zeroswapping {
	public static void main(String[] args) {
		int n=489,rem,sum=0,count=0,count1=0,sum1=0;
		while(n>0) {
			rem=n%10;
			if(rem==9) {
				rem=0;
			}
			else {
				sum=sum*10+rem+1;
				count++;
				
			}
			count1++;
			n/=10;
			
		}
		System.out.println(sum);
		while(sum>0) {
			rem=sum%10;
			sum1=sum1*10+rem;
			sum/=10;
		}
		for(;count<count1;count++) {
			sum1=sum1*10;
		}
		System.out.println(sum1);
	}

}

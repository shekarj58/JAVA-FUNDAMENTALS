
public class armstrongprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digit=0,rem,sum=0;
		for(int num=1;num<1000000;num++) {
			int n=num;
			sum=0;
			digit=0;
			while(num>0)
			{
				digit++;
				num/=10;
			}
			num=n;
			while(num>0)
			{
				rem=num%10;
				sum=(int)(sum+Math.pow(rem,digit));
				num/=10;
			}
			num=n;
			if(num==sum) 
			{
				int count=0;
				for(int i=2;i<=num/2;i++) 
				{	//int count=0;
					if(num%i==0)
					
					{
						count++;
					}
				}
				if(count==0&&num!=1) 
				{
					System.out.println(num);
				}
				//System.out.println(sum);
			}
			
			
		}

	}

}

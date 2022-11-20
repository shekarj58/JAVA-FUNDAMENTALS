
public class febprime {

	public static void main(String[] args)
	{
		int a=0,b=1,n=1;
		 
		int count=0;
		for(int x=0;x<18;x++) 
		{
			if((count%2==0&&n==0)||count==0)
			{
				 
				System.out.print(a+" ");
				int c=a+b;
				a=b;
				b=c;
				x=x-1;
				 
				count++;
			}
			else 
			{
				int d=0;
				for(int i=2;i<=x/2;i++) 
				{
					if(x%i==0) 
					{
						d++;
						//count++;
					}
				}
				n=1;
				if(d==0&&x!=0&&x!=1)
				{
					count++;
					n=d;
					System.out.print(x+" ");
				}
				
			}
		}
	}
} 
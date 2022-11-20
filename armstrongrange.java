
public class armstrongrange {
	public static void main(String args[]) {
		int rem,rev=0,temp;
		for(int num=100;num<500;num++) {
			temp=num;
			int c=0,sum=0;
			while(temp>0) {
				c++;
				temp=temp/10;
			}
			temp=num;
			int temp1=c;
			while(num>0) {
				int p=1;
				c=temp1;
				while(c>0) {
				rem=num%10;
				p=p*rem;
				c--;
				}
				num=num/10;
				sum=sum+p;
				
			}
			if(sum==temp) {
			System.out.println(sum);
			}
			num=temp;
		}
	}

}

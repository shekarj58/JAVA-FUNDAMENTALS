
public class automaticnumberrange {
	public static void main(String[] args) {
		for(int x=1;x<10000;x++) {
			int square=x*x,count=0;
			int temp=x;
			while(temp>0) {
				count++;
				temp=temp/10;
			}
			 
			if(square%(Math.pow(10, count))==x )
			{
				System.out.println(x);
			}
		}
	}

}

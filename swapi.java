class Swapi{
	public static void main(String[] args){
		int num=1234,count=0,rem1=0,rev1=0,temp=1,rem2=0;
		while(num>0) {
			rem1=num%10;
			num=num/10;
			count++;
			if(count==1) {
				temp=rem1;
				rem2=num%100;
				num=num/100;
				rev1=rem2;
				
				
			}
			
			
			}
			int value=(((rem2+(temp*100))*10)+rem1);
			System.out.println(value);
			 
		}
 
	}

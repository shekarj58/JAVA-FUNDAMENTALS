class swap2i{
	public static void main(String args[]){
		int num1=1234,rem1,rem2,rev1=0,rev2=0;
		int num2=num1%100;
		int num3=num1/100;
			while(num2>0){
				rem1=num2%10;
				num2=num2/10;
				rev1=rev1*10+rem1;
				
			}
			while(num3>0){
				rem2=num3%10;
				num3=num3/10;
				rev2=rev2*10+rem2;
			}
			int value=rev2*100+rev1;
			System.out.println(value);
	}
}
		
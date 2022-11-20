class typecast{
	public static void main(String args[]){
		System.out.println("type_casting");
int x=10;
short y=(short)(x+2);//external type casting
System.out.println("external type casting\n"+"x="+x+"\n"+"y="+y);
int a=8;
double b=a+2;
System.out.println("internal type casting\n"+"b="+b);//internal type casting
	}
}
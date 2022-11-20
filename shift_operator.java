class shift{
	public static void main(String args[]){
		int a=10,b=2;
		//left shifting and right shifting c


		//a=10---->0 0 0 0 1	0	1	0
		System.out.println(a<<b); 
		/*0 0 0 0 1 0 1 0 a=10 bits shifted to left side by 2 positions
		and appending two zeros at right side
		0 0 1 0  1 0 0 0
		  it is now equal to 40*/
		  
		System.out.println(a>>b);
		/* 0 0 0 0 1 0 1 0 a=10 bits shifted to right side by 2 positions and appended two
		zeros at left side now it becomes
		0 0 0 0 0 0 1 0 
		i.e 2*/
	}
}
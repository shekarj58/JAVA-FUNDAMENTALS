class switch1{
	public static void main(String[] args){
	 
	
		
		
		
		
	String ch1="+";//ch2="-",ch3="*",ch4="/",ch5="even",ch6="odd";
	Scanner sc=new Scanner(System.in);
	String ch=sc.nextLine();
	int num1=20,num2=50,num3=80;
	
	
	switch(ch){
		case ch1:System.out.println("addition"+(num1+num2));
					break;
		case "-":System.out.println("subtraction"+(num1-num2));
		break; 
		
		case "*":System.out.println("multiplication"+(num1*num2));
		break;
		
		case "/":System.out.println("division"+(num1/num2));
		case "even":System.out.println("print even numbers from num1 to num2");
					while(num1<num2){
						System.out.println(num1);
						num1=num1+2;
					}
					break;
		case "odd":System.out.println("odd numbers from num1 to num2");
					while(num1<num2){
						if(num1%2!=0){
					System.out.println(num1);
						}
						num1+=1;
						}
						break;
					
		default:System.out.println("REmainder"+(num1%num2)+"please leave me i can't do anymore operations");
	}
	}
}
	
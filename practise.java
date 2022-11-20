import java.util.*;
class practise
{
	public static void main(String[] args){  
	 
 public class sales {

	public static void main(String[] args) { 
	
	  int num=1230,sum1=0,sum2=0,rev1=0,temp=1,rev2=0;
	  while(num>0) {
		  int rem1=num%10;
		  rev1=rev1*10+rem1;
		  num=num/10;
		  if(rem1==0) {
			  temp=10;
		  }
	  }
	  System.out.println(rev1);
	  int x=4;
	   while(x>0) {
		   int rem2=rev1%10;
		   rev2=rev2*10+rem2;
		   rev1/=10;
		   x--;
		  
		   switch(rem2) {
		   case 1:System.out.print("one ");
		   	break;
		   case 2:System.out.print("two ");
		   break;
		   case 3:System.out.print("three ");
		   break;

		   case 4:System.out.print("four ");
		   break;
		   case 5:System.out.print("five ");
		   break;
		   case 6:System.out.print("six ");
		   break;

		   case 7:System.out.print("seven ");
		   break;
		   case 8:System.out.print("eight ");
		   break;
		   case 9:System.out.print("nine ");
		   break;
		   case 0:System.out.print("Zero ");
		   break;
		   }
		    
			   
		   }
	   System.out.println(rev2);
		   
		   }

	 
}

	
	
	 
		
	
}
}

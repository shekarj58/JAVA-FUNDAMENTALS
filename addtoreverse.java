class add1{
	public static void main(String[] args)
	{
		int num=579,rem,rev=0,rev1=0,count=0;
  while(num>0) {
	  rem=num%10;
	  count++;
	  num=num/10;
	  if(rem==9) {
		  rev=rev*10;
	  }
	  else
	  {
		  rev=rev*10+rem+1;
		  //System.out.println(rev);
	  }
	  
  }
  int x=count;
  while(x>0) {
	  rem=rev%10;
	  rev1=rev1*10+rem;
	  rev=rev/10;
	   x--;
  }
  System.out.println(rev1);
	}
}
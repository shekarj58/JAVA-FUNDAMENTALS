class Prime{
	public static void main(String args[]){
		int i=2;
		while(i<300)
		{
			int count=0;
			int j=2;
			while(j<i)//2<3
			{
				if(i%j==0)//0
				{
			count=count+1;
				}
				j++;//3
			}
			if(count==0)
			{
				System.out.println(i);
			}
			
			i++;//3
		}
		
	}
}
		
			
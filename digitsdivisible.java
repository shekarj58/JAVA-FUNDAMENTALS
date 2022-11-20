class digits
{
	public static void main(String[] args){
		int num=256363,rem,count=0;
		while(num>0){
			rem=num%10;
			num=num/10;
			if(rem%2==0&&rem%3==0){
				count++;
			}
		}
		System.out.println(count);
	}
}
		
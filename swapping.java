class swap{
public static void main(String[] args)
{
int a=20;
int b=30;
System.out.println("before swapping \na="+a+",b="+b);
System.out.println("swapping without using third variable");
a=a*b;//600
b=a/b;//20
a=a/b;//30
System.out.println("after swapping \na="+a+",b="+b);
}
}

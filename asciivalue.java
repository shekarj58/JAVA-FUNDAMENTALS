import java.util.*;
public class asciivalue {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int ch=sc.nextInt();
	char c=(char)(ch);
	System.out.println(c);
	if(c>=65&&c<=90) {
		System.out.println("UPPER CASE LETTER");
	}
	else if(ch>=97&&ch<=122) {
	System.out.println("lower case letter");
	}
	else {
		System.out.println("Special_symbol");
	}
}
}

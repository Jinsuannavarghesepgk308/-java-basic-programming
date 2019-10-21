package operators;
import java.util.Scanner;
public class swpwithouttemp {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=5;
		int b=10;
		a = a+b;
		b =a-b;
		a =a-b;
		
		System.out.println(a);
		System.out.println(b);
		
		

	}

}

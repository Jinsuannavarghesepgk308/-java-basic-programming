package operators;
import java.util.Scanner;

public class twooutput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int a=n%10;
		int b=a*a;
		int c=n/100;
		int d=c*a;
		int m=b*d;
		System.out.printf("%d%d\n",b,d);
		System.out.printf("%d",m);
		

	}

}

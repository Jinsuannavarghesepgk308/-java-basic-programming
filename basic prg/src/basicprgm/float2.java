package basicprgm;
import java.util.Scanner;

public class float2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input: ");
		
		float a=s.nextFloat();
		s.nextLine();
		System.out.printf("%.3f",a);
		int b=s.nextInt();
		System.out.printf("%03f", b);
				

	}

}

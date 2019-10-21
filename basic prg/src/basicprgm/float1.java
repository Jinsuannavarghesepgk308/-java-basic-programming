package basicprgm;
import java.util.Scanner;

public class float1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input: ");
		float a=s.nextFloat();
		s.nextLine();
		System.out.printf("%.0f\n",a);
		System.out.printf("%.1f\n",a);
		System.out.printf("%.2f\n",a);

		

	}

}

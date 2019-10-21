package operators;
import java.util.Scanner;


public class simpleinterest {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int p =s.nextInt();
		int n =s.nextInt();
		 float r =s.nextFloat();
		float num=(p*n*r)/100;
		System.out.printf("%f.2f",num);
		

	}

}

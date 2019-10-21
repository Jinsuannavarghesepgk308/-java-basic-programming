package decisionmaking;
import java.util.Scanner;


public class ifelseif2 {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a =s.nextInt();
		if(a>=70)
		{
			System.out.println("Old age peoples");
		}
		else if(a>=50)
		{
			System.out.println("Middle age peoples");
			
		}
		else if(a>=18)
		{
			System.out.println("Adult peoples");
		}
		else
		{System.out.println("Childrens");
		
		}

	}

}

package decisionmaking;
import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the year: ");
		int n=s.nextInt();
		
		if(n%4==0)
		{
			
				System.out.println("Is a leap year");
		}
		
				else
				
					System.out.println("Not a leap year");
				}
			
}

package controlstructures;
import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0;
		int a;
		do
		{
			System.out.println("enter an integer: ");
			 a=s.nextInt();
			if(a>0)
			{
				sum =sum+a;
				
			}
		}
			while(a>0);
		
			{
				System.out.println(sum);
				}
			
		}
	
}



		
	





package controlstructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class amstrong {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
System.out.println("enter an integer: ");
		int num = Integer.parseInt(br.readLine());
		int r;
		int arm=0,b=num;
		while(num>0)
		{
			r=num%10;
			arm=(r*r*r)+arm;
			num=num/10;
			
		}
		if(b==arm)
		{
			System.out.println("Amstrong");
			
		}
		else
		{
			System.out.println("not Amstrong");
		}
	}
}

			
		
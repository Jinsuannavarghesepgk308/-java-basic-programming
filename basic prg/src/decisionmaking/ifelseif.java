package decisionmaking;
import java.util.Scanner;
public class ifelseif {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	if(a>=90)
	{System.out.println("A grade");
	
	}
	else if(a>=80)
{
	System.out.println("B grade");
	
}
	else if(a>=50)
{
	System.out.println("P grade");
	
}
	else
	{
		System.out.println("Failed");
		
	}

	}

}

package decisionmaking;
import java.util.Scanner;


public class nestedswitch {

	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	
	System.out.println("1)veg\n2)non-veg \n");
	int n = s.nextInt();
	//System.out.println("food type");
	char f = s.next().charAt(0);
	switch(n)
	{
	case 1:
		System.out.println("veg");
		System.out.println("food type");
		
		switch(f)
		{
		case 'A':
			System.out.println("meals");
		break;
		case 'B':
			System.out.println("fried rice");
		break;
		case 'C':
			System.out.println("idli &sambar");
		break;
		default:
			System.out.println("invalid input");
		}
		break;
		
		
	case 2:
		System.out.println("non veg");
		
		switch(f)
		{
		case 'A':
			System.out.println("chicken biriyani");
		break;
		case 'B':
			System.out.println("parotta & beaf");
		break;
		case 'C':
			System.out.println("sharjah shake"); 
			}
		
		break;
		
		default:
			System.out.println("invalid input");
		}
		
        }
}

	
	


	

	



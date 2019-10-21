package decisionmaking;
import java.util.Scanner;
public class lcmandhcf {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number: ");
	int a=s.nextInt();
	System.out.println("enter the number2: ");
	
	int b=s.nextInt();
	
	int min,i;
	
	
	int gcd=0;
	
	 min=(a<b)?a:b;
	 
	 
	 
	for(i=min;i>0;i--)
	{
		if(a%i==0 && b%i==0)
			gcd=i;
		break;
		
	}
	System.out.println(gcd);
	s.close();
	
	

	}

}

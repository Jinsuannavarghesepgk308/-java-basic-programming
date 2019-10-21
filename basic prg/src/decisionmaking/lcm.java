package decisionmaking;

import java.util.Scanner;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		int a=s.nextInt();
		System.out.println("enter the number2: ");
		
		int b=s.nextInt();
		
		int max,i;
		
		
		int lcm=0;
		
		max=(a>b)?a:b;
		 
		 for(i=max;i<(a*b);i++)
		 
		 {
		
			if(i%a==0 && i%b==0)
				lcm=i;
			break;
			
	}
		System.out.println(lcm);
		s.close();
		
		

		}
	}
	







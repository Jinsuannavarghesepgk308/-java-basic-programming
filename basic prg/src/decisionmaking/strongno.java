package decisionmaking;
import java.util.Scanner;

public class strongno {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=s.nextInt();
		int f,sum=0,num=n,r,i;
				while(n!=0)
		{
					f=1;
			r=n%10;
			for(i=1;i<=r;i++)
			{
				f=f*i;
			}
			sum=sum+f;
			n/=10;
			
		}
				if(sum==num)
					System.out.println("Strong number");
				else
					System.out.println("Not a strong number");
			
		
			s.close();

	}

}

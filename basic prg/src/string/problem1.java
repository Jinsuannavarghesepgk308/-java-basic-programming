package string;
import java.util.Scanner;
public class problem1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size: ");
		int size =s.nextInt();
		String arr[]=new String[size];
		int i;
		for(i=0;i<size;i++)
		{
		 arr[i]=s.next();
		 
		}
		char c;
		
		for(i=0;i<size;i++)
		{
			c=arr[i].charAt(0);
			
			if(c=='a'||c=='e'||c=='i'|| c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				System.out.println(arr[i]);
				
			
		}

	}

}

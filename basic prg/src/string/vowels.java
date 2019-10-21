package string;
import java.util.Scanner;

public class vowels {
Scanner s=new Scanner(System.in);

String n=s.next();
int length=n.length();
int count=0;


for(int i=0;i<n.length();i++);

{
	char c=n.charAt(i);
	
	
	
	if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U');
	
	{
		count++;
	}
	for(int j=0;j<count;j++)
	{
		System.out.print("*");
		
	}
	System.out.print(c);
	for(int k=0;k<count;k++)
	{
		System.out.print("*");
	}
	
	}
else
{
	System.out.print(C);
}
	
}
}

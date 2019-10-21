package array;
import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size: ");
	int size=s.nextInt();
	int[] a = new int[size];
	int sum=0,sum1=0,b=0,c=0;
	int e,o;
	int i;
	
	for( i=0;i<size;i++)
	{
		System.out.println("enter the index +i+");
		a[i]=s.nextInt();
	
	
	}
	for( i=0;i<size;i++)
	{
		
if(a[i]%2!=0)
{
	System.out.println(a[i]);
	sum=sum+a[i];
	b++;
}
	}
for( i=0;i<size;i++)
{
	if(a[i]%2==0)
	{
		
	
		System.out.println(a[i]);
	sum1=sum1+a[i];
	c++;
	
}
	}
	e=sum/b;
	o=sum1/c;
	System.out.println(e);
	System.out.println(o);
	

}
}


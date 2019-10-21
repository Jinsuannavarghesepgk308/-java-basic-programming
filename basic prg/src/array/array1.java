package array;
import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	
	int n=s.nextInt();
	int[] a=new int[5];
	int[] b=new int[5];
	int i;
	for(i=0;i<3;i++)
	{
		System.out.println("enter array1index["+i + "]");
		a[i]=s.nextInt();
		
	}
	for(i=0;i<3;i++)
	{
		System.out.println("enter array2index["+i + "]");
		b[i]=s.nextInt();

	}
	for(i=0;i<3;i++)
	{
		System.out.println(a[i]+b[i]);
		
	}
		
	}
}

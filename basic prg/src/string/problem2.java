package string;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			
			String a  =s.next();
			String b= ""+a.charAt(3)+a.charAt(4);
			switch(b)
			
  
      {
      case "01":System.out.println("january");
           break;
           case "02":System.out.println("february");
           break;
           case "03":System.out.println("march");
           break;
           case "04":System.out.println("april");
           break;
           case "05":System.out.println("may");
           break;
           case "06":System.out.println("june");
           break;
           case "07":System.out.println("july");
           break;
           case" 08":System.out.println("august");
           break;
           case "09":System.out.println("september");
           break;
           case "10":System.out.println("october");
           break;
           case "11":System.out.println("november");
           break;
           case "12":System.out.println("december");
           break;
           default:
        	   System.out.println("invalid input");
           s.close();
      }
			
	}
}
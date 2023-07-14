package full_java;

import java.util.Scanner;

public class project {
	public static void main(String[] args) {
		double x;
		double y;
		double z;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of x:");
		 x = scanner.nextDouble();
		 System.out.println("enter the value of y:");
		 y= scanner.nextDouble();
		 double t =(x*x)+(y*y);
		 z = Math.sqrt(t);			
		 System.out.println("the area is equa to "+z);
		 scanner.close();
		 
		 
		 }

}

package full_java;
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			  System.out.println("enter a whole number to dvide");
			  int x =scanner.nextInt();
			  System.out.println("enter a whole number divide by");
			  int y =scanner.nextInt();
			  int z =x/y;
			  System.out.println("result: "+z);
		}
		
		catch(ArithmeticException e) {
			System.out.println("you cant divide by 0 idiot");
			
			
		}
		catch(InputMismatchException e) {
			System.out.println("please enter a number");
			
		}
		finally{
			scanner.close();
			
			
		}
		
		

	}

}

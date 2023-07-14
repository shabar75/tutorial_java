package full_java;
import java.util.Scanner;
public class NESTED {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rows;
		int col;
		String symbol ="";
		System.out.println("please enter the rows");
		rows= scanner.nextInt();
		System.out.println("please enter the coloms");
		col= scanner.nextInt();
		System.out.println("please enter the symol");
		symbol= scanner.next();
		
		for(int i=1; i<=rows; i++) {
			System.out.println();
			for(int j=1; j<=col; j++) {
				System.out.print(symbol);
			}
			
		}
		
		
	}

}

package full_java;
import java.util.Scanner;

public class ogica_op {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);		
		System.out.println("you are playing a game press q to quit or Q to quit");
		String response= scanner.next();
		if(response.contentEquals("q")||response.contentEquals("Q")) {
			System.out.println("you have succusfuly qit the game");
		}
		else {
			System.out.println("you have entered wrong input");
		}
	
	}

}

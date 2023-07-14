package full_java;
import java.util.Scanner;
public class input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter yoyr name?");
		String name = scanner.nextLine();
		System.out.println("what is your age");
		int age = scanner.nextInt();
		scanner.nextLine();
	    System.out.println("WHAT IS YOYR FAV FOOD");
	    String food = scanner.nextLine();
	    
	    
	    
	    
	    System.out.println("hello "+name);
	    System.out.println("your are"+age+"years old");
	    System.out.println("your fav food is "+food);
	    

				
		}

}

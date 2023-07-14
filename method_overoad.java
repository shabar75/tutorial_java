package full_java;

public class method_overoad {
	public static void main(String[] args) {
		int x= add(2,3);
		System.out.println(x);
		int y= add(2,3,5);
		System.out.println(y);
		
		
	}
	static int add(int a,int b) {
		System.out.println("method 1");
		return a+b;
		
	}
	static int add(int a,int b, int c ) {
		System.out.println("method 2");
		return a+b+c;
	}
	static int add(int a ,int b ,int c,int d ) {
		System.out.println("method 3");
		return a+b+c+d;
	}

}

package full_java;

public class fish implements pray,predeture {

	@Override
	public void hunt() {
		System.out.println("fish is eating small fish");
		
	}

	@Override
	public void flee() {
		System.out.println("this fish is fleeing from large fish");
		
	}

}

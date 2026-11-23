
public class Hacker extends Character {
	
	// Constructor
	public Hacker(String name, int power) {
		super(name, power);
	}
	
	// Override Character Action
	@Override
	public void performAction() {
		System.out.println(getName() + " hacks the server system!");
	}
}

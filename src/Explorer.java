
public class Explorer extends Character {
	
	// Constructor
	public Explorer(String name, int power) {
		super(name, power);
	}
	
	// Override Character Action
	@Override
	public void performAction() {
		System.out.println(getName() + " discovers a mysterious artifact!");
	}
}

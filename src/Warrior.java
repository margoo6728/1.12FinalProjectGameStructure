
public class Warrior extends Character {
	
	// Constructor
	public Warrior(String name, int power) {
		super(name, power);
	}
	
	// Override Character Action
	@Override
	public void performAction() {
		System.out.println(getName() + " performs a special attack!");
	}
}

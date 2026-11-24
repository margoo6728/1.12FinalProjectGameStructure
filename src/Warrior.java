/**
 * Represents a warrior in the Fantasy Dungeon theme.
 *
 * Student Notes:
 * - This subclass extends the Character parent class.
 * - Inherits the character attributes and accessible methods.
 * - Uses super() to call the parent class constructor.
 * - Overrides performAction() to perform a special attack.
 * - Demonstrates inheritance and polymorphism.
 */

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

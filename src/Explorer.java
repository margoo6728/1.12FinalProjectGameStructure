/**
 * Represents an explorer in the Space Explorer theme.
 *
 * Student Notes:
 * - This subclass extends the Character parent class.
 * - Inherits the character attributes and accessible methods.
 * - Uses super() to call the parent class constructor.
 * - Overrides performAction() to discover a mysterious artifact.
 * - Demonstrates inheritance and polymorphism.
 */

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

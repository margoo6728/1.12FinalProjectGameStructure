/**
 * Represents a hacker in the Cyber Hacker theme.
 *
 * Student Notes:
 * - This subclass extends the Character parent class.
 * - Inherits the character attributes and accessible methods.
 * - Uses super() to call the parent class constructor.
 * - Overrides performAction() to hack into a security system.
 * - Demonstrates inheritance and polymorphism.
 */

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

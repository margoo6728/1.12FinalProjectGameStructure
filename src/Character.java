/**
 * Represents a character in the game.
 *
 * Student Notes:
 * - Serves as the parent class for all character subclasses.
 * - Defines common character attributes and methods.
 * - Uses getters and setters to access and modify attributes.
 * - Provides the performAction() method for subclasses to override.
 * - Allows different character types to be referenced as Character.
 * - Supports inheritance, encapsulation, and polymorphism.
 */

public class Character {

    private String name;
    private int power;

    public Character(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getSummary() {
        return "Character: " + name + " | Power: " + power;
    }
    
    // Create a Method for Character's Actions
    public void performAction() {
    	System.out.println(name + " performs an action.");
    }
 }

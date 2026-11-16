
public class Item {

	// Declare Private Fields
	private String name;
	private String description;
	private int quantity;
	
	// Create a Constructor for Inventory Items
	public Item(String name, String description, int quantity)
	{
		this.name = name;
		this.description = description;
		this.quantity = quantity;
	}
	
	// Create Get Classes
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}

	public int getQuanity()
	{
		return quantity;
	}
	
	// Create Set Classes
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	// Create a Method to Return Inventory Summary
	public String getSummary()
	{
		return "Item: " + name
				+ " | Description: " + description
				+ " | Quantity: " + quantity;
	}
}


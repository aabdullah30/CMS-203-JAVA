package application;

public abstract class Beverage {
	// Instance Vars
	private String name;
	private TYPE type;
	private SIZE size;
	private final int BASE_PRICE = 2;
	private final int SIZE_PRICE = 1;
	
	/**
	 * Parameterized Constructor
	 * 
	 * @param name
	 * @param type
	 * @param size
	 */
	public Beverage(String name, TYPE type, SIZE size)
	{
		this.name = name;
		this.type = type;
		this.size = size;
	}
	
	/**
	 * Abstract method for calculating price
	 * 
	 * @return calculated price
	 */
	abstract double calcPrice();
	
	/**
	 * Creates string representation of Beverage
	 * 
	 * @return String representation of Beverage
	 */
	public String toString()
	{
		return "Name: " + name + ", Size: " + size;
	}
	
	/**
	 * Method to be overridden that checks if two Beverage objects are equal
	 * 
	 * @param b
	 * 
	 * @return true if object variables are equal, false otherwise
	 */
	public boolean equals(Beverage b)
	{
		return name.equals(b.getBevName()) && type == b.getType() && size == b.getSize();
	}
	
	/**
	 * Getter for name
	 * 
	 * @return
	 */
	public String getBevName()
	{
		return name;
	}
	
	/**
	 * Getter for type
	 * 
	 * @return
	 */
	public TYPE getType()
	{
		return type;
	}
	
	/**
	 * Getter for size
	 * 
	 * @return
	 */
	public SIZE getSize()
	{
		return size;
	}
	
	/**
	 * Getter for base price
	 * 
	 * @return
	 */
	public int getBasePrice()
	{
		return BASE_PRICE;
	}
	
	/**
	 * Getter for size price
	 * 
	 * @return
	 */
	public int getSizePrice()
	{
		return SIZE_PRICE;
	}
	
	/**
	 * Setter for name
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Setter for type
	 * 
	 * @param type
	 */
	public void setType(TYPE type)
	{
		this.type = type;
	}
	
	/**
	 * Setter for size
	 * 
	 * @param size
	 */
	public void setSize(SIZE size)
	{
		this.size = size;
	}
}

package application;

public class Coffee extends Beverage{
	// Instance Vars
	private boolean extraShot, extraSyrup;
	
	/**
	 * Parameterized Constructor
	 * 
	 * @param name
	 * @param size
	 * @param extraShot
	 * @param extraSyrup
	 */
	public Coffee(String name, SIZE size, boolean extraShot, boolean extraSyrup)
	{	
		super(name, TYPE.COFFEE, size);
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
	}
	
	/**
	 * Creates string representation of coffee
	 * 
	 * @return string representation of coffee
	 */
	public String toString()
	{
		return super.toString() + ", Extra Shot: " + extraShot + ", Extra Syrup: " + extraSyrup + ", Price: " + Double.toString(calcPrice());
	}
	
	/**
	 * Calculates price of coffee
	 * 
	 * @return price of coffee
	 */
	public double calcPrice()
	{
		double price = getBasePrice();
		if (extraShot)
			price += 0.5;
		if (extraSyrup)
			price += 0.5;
		
		switch (getSize())
		{
		case LARGE:
			price += getSizePrice();
		case MEDIUM:
			price += getSizePrice();
		default:
			break;
		}
		
		return price;
	}
	
	/**
	 * Override method to check if two coffee objects are equal
	 * 
	 * @return true if both coffee objects have equal variables, false otherwise
	 */
	@Override
	public boolean equals(Beverage c)
	{
		return super.equals(c) && extraShot == ((Coffee)c).getExtraShot() && extraSyrup == ((Coffee)c).getExtraSyrup();
	}
	
	/**
	 * Getter method for extraShot
	 * 
	 * @return
	 */
	public boolean getExtraShot()
	{
		return extraShot;
	}
	
	/**
	 * Getter method for extraSyrup
	 * 
	 * @return
	 */
	public boolean getExtraSyrup()
	{
		return extraSyrup;
	}
	
	/**
	 * Setter method for extraShot
	 * 
	 * @param extraShot
	 */
	public void setShot(boolean extraShot)
	{
		this.extraShot = extraShot;
	}
	
	/**
	 * Setter method for extraSyrup
	 * 
	 * @param extraSyrup
	 */
	public void setSyrup(boolean extraSyrup)
	{
		this.extraSyrup = extraSyrup;
	}
}
package application;

public class Alcohol extends Beverage{
	// Instance Vars
	private boolean offeredOnWeekend;
	
	/**
	 * Parameterized Constructor
	 * 
	 * @param name
	 * @param size
	 * @param offeredOnWeekend
	 */
	public Alcohol(String name, SIZE size, boolean offeredOnWeekend)
	{	
		super(name, TYPE.ALCOHOL, size);
		this.offeredOnWeekend = offeredOnWeekend;
	}
	
	/**
	 * Creates string representation of Alcohol object
	 * 
	 * @return String representation of Alcohol object
	 */
	public String toString()
	{
		return super.toString() + ", Offered on Weekend: " + offeredOnWeekend + ", Price: " + Double.toString(calcPrice());
	}
	
	/**
	 * Calculates price of alcohol
	 * 
	 * @return Calculated price of alcohol
	 */
	public double calcPrice()
	{
		double price = getBasePrice();
		if (offeredOnWeekend)
			price += 0.6;
		
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
	 * Checks if two alcohol objects are equal
	 * 
	 * @return true if variables of both objects are equal, false otherwise
	 */
	@Override
	public boolean equals(Beverage a)
	{
		return super.equals(a) && offeredOnWeekend == ((Alcohol)a).isOfferedOnWeekend();
	}
	
	/**
	 * Getter for offeredOnWeekend
	 * 
	 * @return
	 */
	public boolean isOfferedOnWeekend()
	{
		return offeredOnWeekend;
	}
	
	/**
	 * setter for offeredOnWeekend
	 * 
	 * @param offeredOnWeekend
	 */
	public void setOfferedOnWeekend(boolean offeredOnWeekend)
	{
		this.offeredOnWeekend = offeredOnWeekend;
	}
}

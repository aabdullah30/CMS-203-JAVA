package application;

public class Smoothie extends Beverage{
	private int fruitNum;
	private boolean protein;
	
	public Smoothie(String name, SIZE size, int fruitNum, boolean protein)
	{	
		super(name, TYPE.SMOOTHIE, size);
		this.fruitNum = fruitNum;
		this.protein = protein;
	}
	
	public String toString()
	{
		return super.toString() + ", Number of Fruits: " + fruitNum + ", Protein Added: " + protein + ", Price: " + Double.toString(calcPrice());
	}
	
	public double calcPrice()
	{
		double price = getBasePrice();
		if (protein)
			price += 1.5;
		price += fruitNum * 0.5;
		
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
	
	@Override
	public boolean equals(Beverage s)
	{
		return super.equals(s) && fruitNum == ((Smoothie)s).getNumOfFruits() && protein == ((Smoothie)s).getAddProtien();
	}
	
	public int getNumOfFruits()
	{
		return fruitNum;
	}
	
	public boolean getAddProtien()
	{
		return protein;
	}
	
	public void setFruitNum(int fruitNum)
	{
		this.fruitNum = fruitNum;
	}
	
	public void setProtein(boolean protein)
	{
		this.protein = protein;
	}
}

package application;

public class Customer {
	// Instance Vars
	private String name;
	private int age;
	
	/**
	 * Parameterized Constructor
	 * 
	 * @param name
	 * @param age
	 */
	public Customer(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	/**
	 * Copy Constructor
	 * 
	 * @param c
	 */
	public Customer(Customer c)
	{
		name = c.getName();
		age = c.getAge();
	}
	
	/**
	 * Creates String representation of customer
	 * 
	 * @return string representation of customer
	 */
	public String toString()
	{
		return "Name: " + name + ", Age: " + age;
	}
	
	/**
	 * Getter method for name
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Getter method for age
	 * 
	 * @return
	 */
	public int getAge()
	{
		
		return age;
	}
	
	/**
	 * Setter method for name
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Setter method for age
	 * 
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
}
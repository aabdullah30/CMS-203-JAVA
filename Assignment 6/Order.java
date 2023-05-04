package application;

import java.util.Random;
import java.util.ArrayList;

/**
 * Class to represent an order, implements OrderInterface and Comparable<Order>
 * 
 * @author Donovan deVise
 *
 */
public class Order implements OrderInterface, Comparable<Order>{
	// Instance Vars
	private int num;
	private DAY day;
	private int time;
	private Customer customer;
	private ArrayList<Beverage> beverages;
	
	/**
	 * Generates a random number between 10000 and 80000
	 * 
	 * @return
	 */
	public int randNum()
	{
		Random rand = new Random();
		return rand.nextInt(80001) + 10000;
	}
	
	/**
	 * Parameterized Constructor
	 * 
	 * @param time
	 * @param day
	 * @param customer
	 */
	public Order(int time, DAY day, Customer customer)
	{
		this.num = randNum();
		this.time = time;
		this.day = day;
		this.customer = customer;
		
		beverages = new ArrayList<Beverage>();
	}
	
	/**
	 * Adds new alcoholic beverage to order
	 * 
	 * @param bevName
	 * @param size
	 */
	public void addNewBeverage(String bevName, SIZE size) {
		beverages.add(new Alcohol(bevName, size, day == DAY.SATURDAY || day == DAY.SUNDAY));
	}
	
	/**
	 * Adds new coffee to order
	 * 
	 * @param bevName
	 * @param size
	 * @param extraShot
	 * @param extraSyrup
	 */
	public void  addNewBeverage(String bevName, SIZE size, boolean extraShot, boolean extraSyrup)
	{
		beverages.add(new Coffee(bevName, size, extraShot, extraSyrup));
	}
	
	/**
	 * Adds new smoothie to order
	 * 
	 * @param bevName
	 * @param size
	 * @param numOfFruits
	 * @param addPRotien
	 */
	public void addNewBeverage( String bevName, SIZE size, int numOfFruits, boolean addPRotien)
	{
		beverages.add(new Smoothie(bevName, size, numOfFruits, addPRotien));
	}
	
	/**
	 * Creates a string representation of the order
	 * 
	 * @return string representation of the order
	 */
	public String toString()
	{
		String out = "Order Number: " + num + ", Time: " + time + ", Day: " + day + ", Customer Name: " + customer.getName() + ", Customer Age: " + customer.getAge();
		for (int i = 0; i < beverages.size(); i++)
		{
			out += '\n' + beverages.get(i).toString();
		}
		out += "\nOrder Total: " + calcOrderTotal();
		return out;
	}
	
	/**
	 * Override method to compare two Orders
	 * 
	 * @param o
	 * 
	 * @return 1 if this has greater OrderNo than o, -1 if it is smaller, 0 if they are equal
	 */
	@Override
	public int compareTo(Order o)
	{
		if (num > o.getOrderNo())
			return 1;
		else if (num < o.getOrderNo())
			return -1;
		return 0;
	}
	
	/**
	 * Checks if day is a weekend
	 * 
	 * @return if day is a weekend, false otherwise
	 */
	public boolean isWeekend() {
		if (day == DAY.SATURDAY || day == DAY.SUNDAY)
			return true;
		return false;
	}

	/**
	 * Gets beverage at index
	 * 
	 * @param itemNo
	 * 
	 * @return beverage at index
	 */
	public Beverage getBeverage(int itemNo) {
		return beverages.get(itemNo);
	}

	/**
	 * Calculates total price of order
	 * 
	 * @return total price of order
	 */
	public double calcOrderTotal() {
		double total = 0;
		for (int i = 0; i < beverages.size(); i++)
			total += beverages.get(i).calcPrice();
		return total;
	}

	/**
	 * Gets number of a type of beverage in order
	 * 
	 * @return number of beverage type in order
	 */
	public int findNumOfBeveType(TYPE type) {
		int count = 0;
		for (int i = 0; i < beverages.size(); i++)
			if (beverages.get(i).getType() == type)
				count++;
		return count;
	}
	
	// Getter Methods
	public int getOrderNo()
	{
		return num;
	}
	public DAY getOrderDay()
	{
		return day;
	}
	public int getOrderTime()
	{
		return time;
	}
	public Customer getCustomer()
	{
		// Uses deep-copy constructor
		return new Customer(customer);
	}
	public ArrayList<Beverage> getBeverages()
	{
		return beverages;
	}
	
	// Setter Methods
	public void setNum(int num)
	{
		this.num = num;
	}
	public void setDay(DAY day) 
	{
		this.day = day;
	}
	public void setTime(int time)
	{
		this.time = time;
	}
	public void setCustomer(Customer customer)
	{
		this.customer = customer;
	}
	public void setBeverages(ArrayList<Beverage> beverages)
	{
		this.beverages = beverages;
	}

	public int getTotalItems() {
		return beverages.size();
	}
}

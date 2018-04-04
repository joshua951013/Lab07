package edu.handong.csee.java.prob2;// package name
/**
 * This is the Class that shows the names, prices and the ratings of the Chickens in the menu.
 * @author Josh.C
 *
 */
public class Chicken { // a class named chicken is made
	private String name; //instance variable 
	private double price;// instance variable
	private int stars; //instance variable
/**
 * Constructor that gives the initial value for the variables
 */
	public Chicken(){ //constructor named chicken
		this.name = ""; // initial value or the name 
		this.price = 0.0; //initial price
		this.stars = 0; //initial rating 
	}
/**
 * This is the method that reads in the information needed
 * @param name
 * @param price
 * @param stars
 */
	public Chicken(String name, double price, int stars){ //method is made with the following name
		this.name = name; // reads in the name 
		this.price = price; //reads in the price
		this.stars = stars; //reads in the rating
	}
/**
 * A getter returning the name of the menu
 * @return name
 */
	public String get_name(){ //getter is made
		return this.name; //returns the following value
	}
/**
 * A getter returning the price of the menu
 * @return price
 */
	public double get_price(){ //getter is made
		return this.price; //returns the following value
	}
/**
 * A getter returning the rating of the menu
 * @return stars
 */
	public int get_stars(){ //getter is made
		return this.stars; //returns the following value
	}
/**
 * A setter that sets name into the following variable
 * @param name
 */
	public void set_name(String name){ //setter is made
		this.name = name; //sets the name with the following
	}
/**
 * A setter that sets price into the following variable
 * @param price
 */
	public void set_price(double price){ //setter is made
		this.price = price; //sets the price with the following
	}
/**
 * A setter that sets rating into the following variable
 * @param stars
 */
	public void set_stars(int stars){ //setter is made
		this.stars = stars; //sets the stars with the following
	}
/**
 * This is the main method that gives the information about the names, prices and ratings of the menu.
 * This method instantiates the Chicken then by calling the methods made above, we achieve the goal for this class
 * @param args
 */
	public static void main(String[] args) { //main method is made
		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5);// instantiating chicken as menu1 giving its name, price and the rating
		Chicken menu2 = new Chicken("Honey_mustard", 16000.00, 5); //instantiating chicken as menu2 giving its name, price and the rating 
		Chicken menu3 = new Chicken("Spicey_chicken", 16000.00, 1);// instantiating chicken as menu3 giving its name, price and the rating

		menu1.set_stars(3);//calls the setter set_stars giving 3 as the value
		menu2.set_stars(4);// calls the setter set_stars giving 4 as the value
		menu3.set_stars(1); //calls the setter set_stars giving 1 as the value

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); //prints out the following, gets the name by calling get_name and gets the rating by get_stars
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());//prints out the following, gets the name by calling get_name and gets the rating by get_stars
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());//prints out the following, gets the name by calling get_name and gets the rating by get_stars
	}

}

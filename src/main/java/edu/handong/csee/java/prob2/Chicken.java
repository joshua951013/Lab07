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
 * A method returning the name of the menu
 * @return name
 */
	public String get_name(){
		return this.name;
	}
/**
 * A method returning the price of the menu
 * @return price
 */
	public double get_price(){
		return this.price;
	}
/**
 * A method returning the rating of the menu
 * @return stars
 */
	public int get_stars(){
		return this.stars;
	}
/**
 * A method that sets name into the following variable
 * @param name
 */
	public void set_name(String name){
		this.name = name;
	}
/**
 * A method that sets price into the following variable
 * @param price
 */
	public void set_price(double price){
		this.price = price;
	}
/**
 * A method that sets rating into the following variable
 * @param stars
 */
	public void set_stars(int stars){
		this.stars = stars;
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

		menu1.set_stars(3);//calls the method set.stars giving 3 as the value
		menu2.set_stars(4);// calls the method set.stars giving 4 as the value
		menu3.set_stars(1); //calls the method set.stars giving 1 as the value

		System.out.println(menu1.get_name() + "'s rating is " + menu1.get_stars()); //prints out the following, gets the name by calling get_name method and gets the rating by get_stars
		System.out.println(menu2.get_name() + "'s rating is " + menu2.get_stars());//prints out the following, gets the name by calling get_name method and gets the rating by get_stars
		System.out.println(menu3.get_name() + "'s rating is " + menu3.get_stars());//prints out the following, gets the name by calling get_name method and gets the rating by get_stars
	}

}

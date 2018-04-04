package edu.handong.csee.java.prob1;//package name
import java.util.Scanner;// imported the following package for the use

/**
 * This class defines the YearToCentury object.
 * It reads in the year as an input then lets the user to find out what century in belongs to.
 * @author Josh.C
 *
 */
public class YearToCentury { //a class named YearToCentury is made

	int year;// an instance variable

/**
 * Constructor initializing the variable 'year'
 */
	public YearToCentury() //constructor named YearToCentury is made
	{
		year = 0; //initialized the year as 0
	}
/**
 * This is a method that reads in the year and puts the value into this.year
 * @param year
 */
	public YearToCentury(int year)// a public type method named YearToCentury is made
	{
		this.year = year;// puts the value of year to this.year 
	}
/**
 * This is the method that reads in the value of year 
 * then with its value, the following calculation takes place to find out which century it belongs to
 * @return year
 */
	public int calc_century()
	{
		if(year % 100 == 0)
			year = year / 100;
		else
		{
			year = (year / 100) + 1;
		}
		return year;
	}
	
/**
 * This is the main method of the class.
 * It instantiates the scanner in order to get the value of the year as an input.
 * Then, it calls the methods mentioned above and gives the result.
 * @param args
 */
	public static void main(String [] args)// main method is made

	{
		int yr = 0; // local variable yr is initialized as 0
		
		Scanner keyboard = new Scanner(System.in);// instantiating the scanner

		System.out.println("Input year: ");// prints out the following
		yr = keyboard.nextInt();// reads in the value from the keyboard and puts that value into yr

		YearToCentury year = new YearToCentury(yr);// instantiating my YearToCentury

		System.out.println(yr + " is " + year.calc_century() + "th century.");// prints out the following

	}

}








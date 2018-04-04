package edu.handong.csee.java.prob3; //package name
import java.util.*; //imported the following class for the random case
/**
 * This is a class that shows whether the following students are absent or not with the number of absences they make.
 * If they make more than 6 absences, then the program will declare that the student has failed.
 * The number of absences will be chosen randomly from 0 to 10.
 * @author Josh.C
 *
 */
public class Attendance { //a class named Attendance is made
	private String name = ""; //instance var
	private int year = 0;//instance var
	private String student_id = "";//instance var
	private int missed = 0;//instance var
/**
 * Its a constructor that initializes the following variables
 */
	//Constructors
	public Attendance(){ //constructor attendance is made
		this.name = "Null"; //gives name the null value
		this.year = 0; //give year 0 value
		this.student_id = "Null"; //gives student id the null value
		this.missed = 0; //gives missed class as 0
	}

/**
 * A method that reads in then puts those values into the following varibles
 * @param name
 * @param year
 * @param student_id
 * @param missed
 */
	public Attendance(String name, int year, String student_id, int missed){ //method attendance is made
		this.name = name; //puts new name data into name
		this.year = year; //puts new year data into year
		this.student_id = student_id; //puts new student id data into student id
		this.missed = missed; // puts new missed data into missed 
	}
/**
 * getter that returns the read value to the following
 * @return name
 */
	//Getters
	public String get_name(){ //getter is made
		return name;//returns the following
	}
/**
 * getter that returns the read value to the following
 * @return year
 */
	public int get_year(){ //getter is made
		return year; //returns the following
	}
/**
 * getter that returns the read value to the following
 * @return student_id
 */
	public String get_id(){ //getter is made
		return student_id; //returns the following
	}
/**
 * getter that returns the read value to the following
 * @return missed
 */
	public int get_missed(){ //getter is made
		return missed; //returns the following
	}
	
	//Setters
/**
 * setter that sets the following with the new data of it
 * @param name
 */
	public void set_name(String name){// setter is made
		this.name = name; //sets the name with the following
	}
/**
 * setter that sets the following with the new data of it
 * @param year
 */
	public void set_year(int year){//setter is made
		this.year = year; //sets year with the following
	}
/**
 * setter that sets the following with the new data of it
 * @param student_id
 */
	public void set_id(String student_id){// setter is made
		this.student_id = student_id; //sets student id with the following
	}
/**
 * setter that sets the following with the new data of it
 * @param missed
 */
	public void set_missed(int missed){ //setter is made
		this.missed = missed; //sets missed with the following
	}

/**
 * This is the main method that gives the random value from 0 to 10 which is the number of absences for the following students
 * Then by calling the methods, setters and getter made above, it gives the values needed as the information and 
 * shows the result whether the student is failed or not.
 * @param args
 */
	public static void main(String[] args) { //main method is made
		Attendance s_1 = new Attendance(); //instantiate Attendance as s_1
		Attendance s_2 = new Attendance(); //instantiate Attendance as s_2
		Attendance s_3 = new Attendance("Lucas", 1, "21833222", 0); //instantiate Attendance as s_3, giving the initial name, year(class),student id and the number of absence
		Attendance s_4 = new Attendance("Martha", 2, "21733444", 0);//instantiate Attendance as s_4, giving the initial name, year(class),student id and the number of absence
		
		s_1.set_name("Jess"); s_1.set_year(4); s_1.set_id("21400999"); s_1.set_missed(0);// sets s_1's information as the following
		s_2.set_name("Kent"); s_2.set_year(2); s_2.set_id("21700111"); s_2.set_missed(0);// sets s_2's information as the following 

		Random randomGenerator = new Random(); //instantiates the random as radomGenerator
		
		s_1.set_missed(randomGenerator.nextInt(10)); //sets the missed number randomly from 0 to 10 of s_1
		s_2.set_missed(randomGenerator.nextInt(10));//sets the missed number randomly from 0 to 10 of s_2
		s_3.set_missed(randomGenerator.nextInt(10));//sets the missed number randomly from 0 to 10 of s_3
		s_4.set_missed(randomGenerator.nextInt(10));//sets the missed number randomly from 0 to 10 of s_4

		if(s_1.get_missed() > 6){ //conditional statement for the result( if more than 6, the following result will be shown
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course"); //prints the following
			System.out.println(s_1.get_name() + " - Number of absence: " + s_1.get_missed()); //prints the following
		}
		else // else statement for if the missed is less than 6
			System.out.println("We'll see about the grade, " + s_1.get_name());//prints the following
		if(s_2.get_missed() > 6){//conditional statement for the result( if more than 6, the following result will be shown
			System.out.println("I'm sorry " + s_2.get_name() + ". You fail this course"); //prints the following
			System.out.println(s_2.get_name() + " - Number of absence: " + s_2.get_missed());//prints the following
		}
		else// else statement for if the missed is less than 6
			System.out.println("We'll see about the grade, " + s_2.get_name());
		if(s_3.get_missed() > 6){//conditional statement for the result( if more than 6, the following result will be shown
			System.out.println("I'm sorry " + s_3.get_name() + ". You fail this course");//prints the following
			System.out.println(s_3.get_name() + " - Number of absence: " + s_3.get_missed());//prints the following
		}
		else// else statement for if the missed is less than 6
			System.out.println("We'll see about the grade, " + s_3.get_name());
		if(s_4.get_missed() > 6){//conditional statement for the result( if more than 6, the following result will be shown
			System.out.println("I'm sorry " + s_1.get_name() + ". You fail this course");//prints the following
			System.out.println(s_4.get_name() + " - Number of absence: " + s_4.get_missed());//prints the following
		}
		else// else statement for if the missed is less than 6
			System.out.println("We'll see about the grade, " + s_4.get_name());//prints the following

	}



}

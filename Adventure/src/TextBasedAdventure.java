import java.util.Scanner;

public class TextBasedAdventure {
	
	public static Scanner in = new Scanner(System.in);
	public static String name;
	
	public static void main(String[] args) {
		
		intro();
	}
	
	public static void intro() {
		System.out.println("Hi.");
		Timer.oneSecond();
		System.out.println("This is your adventure.");
		Timer.oneSecond();
		System.out.println("Are you male or female?");
		genderChoice();
	}
	
	public static void genderChoice() {
		switch(in.next()) {
		
		case "male":
			System.out.println("I see, you are male.");
			nameChoice();
			break;
			
		case "female":
			System.out.println("I see, you are female.");
			nameChoice();
			break;
		
		default:
			System.out.println("That's not a gender. Please try again.");
			genderChoice();
			break;
		
		}
	}
	
	public static void nameChoice() {
		
		System.out.println("Alright, what's your name? Hopefully it fits your gender.");
		name = in.next();
		System.out.println("I see! Your name is " + name +", how fitting!");
		start();
		
	}
	
	public static void start() {
		
		System.out.println("Okay, " + name + ", this is where your adventure begins!");
		
	}

}

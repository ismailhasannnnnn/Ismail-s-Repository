import java.util.Scanner;

public class Introduction {
	
	public static Scanner in = new Scanner(System.in);
	public static String name;
	public static int gender;
	public static String narration1;
	
	public static void main(String[] args) throws InterruptedException {
		
		intro();
	}
	
	public static void intro() throws InterruptedException { // would be start menu of gui
		System.out.println("Hi.");
		Timer.oneSecond();
		System.out.println("This is your adventure.");
		Timer.oneSecond();
		System.out.println("Are you male or female?");
		genderChoice();
	}
	
	public static void genderChoice() throws InterruptedException { // gender is chosen. part of intro in gui
		switch(in.next()) {
		
		case "male":
			System.out.println("I see, you are male.");
			gender = 1;
			nameChoice();
			break;
			
		case "female":
			System.out.println("I see, you are female.");
			gender = 2;
			nameChoice();
			break;
		
		default:
			System.out.println("That's not a gender. Please try again.");
			genderChoice();
			break;
		
		}
	}
	
	public static void nameChoice() throws InterruptedException {
		
		Timer.oneSecond();
		System.out.println("Alright, what's your name? Hopefully it fits your gender.");
		name = in.next();
		System.out.println("I see! Your name is " + name +", how fitting!");
		Timer.oneSecond();
		start();
		
	}
	
	public static void start() throws InterruptedException {
		
		System.out.println("Okay, " + name + ", what're you up to right now?");
		in.next();
		System.out.println("Oh really! That seems really interesting.");
		Timer.oneSecond();
		System.out.println("We should really get going, it's gonna get dark soon, " + name + ".");
		
		
		if(gender == 1) {
		 narration1 = "From then on, nobody knew just how incredibly gifted " + name + " was. "  // two lines, same string
		 + System.lineSeparator() + "Little did he know, but something big was about to hit America, and his life would be changed forever.";
		}
		
		if(gender == 2) {
			narration1 = "From then on, nobody knew just how incredibly gifted " + name + " was. "  // two lines, same string
			+ System.lineSeparator() + "Little did she know, but something big was about to hit America, and her life would be changed forever.";
		}
		
		
		Timer.oneSecond();
		for(int i = 0; i < narration1.length(); i++ ) {
			char c = narration1.charAt(i);
			System.out.print(c);
			Thread.sleep(100);
		
		}
		
		//calling method from another class placeholder
		
	}

}

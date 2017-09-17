import java.util.Scanner;

public class Introduction {
	
	public static Scanner in = new Scanner(System.in);
	public static String name;
	public static int gender;
	public static String narration1;
	public static String narration2;
	public static String bestFriendName;
	public static int bestFriendGender;  // 1 - boy   2 - girl
	
	
	public static void main(String[] args) throws InterruptedException {

		TyperIntro.intro();
		System.out.println();
		TyperIntro.question();
		System.out.println();
		Introduction.genderChoice();
		}
	
	
	public static void intro()    { // would be start menu of gui
		
	}
	
	public static void genderChoice() { // gender is chosen. part of intro in gui
		switch(in.next()) {
		
		case "male":
			TyperIntro.selectMale();
			System.out.println(); 		// here because without it, it just prints nameChoice on same line
			gender = 1;
			nameChoice();
			break;
			
		case "female":
			TyperIntro.selectFemale();
			System.out.println();
			gender = 2;
			nameChoice();
			break;

		
		default:
//			TyperIntro.genderFail();			//  keeps looping till it detects male or female. ex. "i am a male". 
//			System.out.println();				// doesn't tell you whats wrong when u put something random though
			genderChoice();	
//			break;
			}
			
	}
			
	public static void nameChoice()  {
		
		Timer.oneSecond();
		TyperIntro.askName();
		System.out.println();
		in.nextLine();
		name = in.nextLine();
		TyperIntro.selectName();
		Timer.oneSecond();
		System.out.println();
		
		if (gender == 1){
			bestFriendGender = 2;
			TyperIntro.bestFriendGirl();
			
		}
		if (gender == 2) {
			bestFriendGender = 1;
			TyperIntro.bestFriendBoy();
		}
		
		bestFriendName = in.nextLine();
		TyperIntro.selectFriendName();
		Timer.oneSecond();
		System.out.println();
		end();
		
	}
	
	public static void end()  {
		
		
		
		TyperIntro.theEnd();
		Timer.oneSecond();
		System.out.println();
		TyperIntro.theEnd2();
		Timer.oneSecond();
		System.out.println();
		
		
		if(gender == 1) {
			TyperIntro.maleEnd();
			chapterOne.Main();
		}
		
		if(gender == 2) {
			TyperIntro.femaleEnd();
			chapterOne.Main();

		}
		
		
		
		
	}
		
		
		
		//calling method from another class placeholder
		
}



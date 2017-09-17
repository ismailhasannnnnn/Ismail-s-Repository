
public class chapterOne {				//replaced story.java
	
	public static int energy;
	public static int sleepiness = 8;
	public static int knowledge1;
	public chapterOne() {
	}
	
	public static void Main() {													// part one 
		
		
		Timer.oneSecond();
		System.out.println();
		System.out.println("\n\nCHAPTER ONE: HOME SWEET HOME \n");
		Timer.oneSecond();
		wakeup();
			
	}
	public static void wakeup() {
		TyperOne.wakeUp();
		Timer.oneSecond();
		System.out.println();
		System.out.println("You wake up, wondering who, or what, that voice belonged to.\n"); 					// non dialogue stuff isn't typer 
		Timer.oneSecond();
		decision1();
	}
		
	public static void decision1() {
		
		System.out.println("What do you do? \n----------------------\n(1) Go back to sleep, you're probably still dreaming \n(2) Go downstairs\n---------------------- ");
		
		
		switch(Introduction.in.nextLine()) {
		
		case "1":
			System.out.println("You drift slowly back to sleep, only to hear the same eerie voice when you wake up 8 hours later");
			System.out.println();
			Timer.oneSecond();
			sleepiness = sleepiness +8;
			wakeup();
			break;
			
		case "2":
			System.out.println("\nYou go downstairs");
			Timer.oneSecond();
			decision2();
			break;
		
		default:
			decision1();	
		}
	}
	
	
	
	public static void decision2() {
		
		System.out.println();
		System.out.println("As you walk downstairs, you hear the familiar sounds of utensils clashing with plates. You greet Mom and dad, who are eating breakfast.");
		Timer.oneHalfSecond();
		
		if(Introduction.gender == 1 && sleepiness == 8) {
			TyperOne.Mom1Male();
			Timer.oneSecond();
			decision3();
			
		}
		if(Introduction.gender == 2 && sleepiness == 8) {
			TyperOne.Mom1Female();
			Timer.oneSecond();
			decision3();
		}
		if(sleepiness > 8) {
			TyperOne.Dad1();
			decision3();
		}
	}
	public static void decision3() {
		System.out.println("\n----------------------\n(1) Eat some breakfast \n(2) Skip breakfast and leave. You're late for school.\n----------------------\n");
		
		
		switch(Introduction.in.nextLine()) {
		
		case "1":
			
			System.out.println();
			decision4();
			break;
			
		
		case "2":
			TyperOne.MomDad1();
			System.out.println();
			Timer.oneSecond();
			System.out.println("You think about what your dad says, and you decide to stay.\n ");
			Timer.oneHalfSecond();
			
			decision4();
			break;
		
		default:
			decision3();
				
		}
	}
	public static void decision4() {
		
		System.out.println("As you sit down and eat the left over tuna casserole from last night, \nyou hear the TV news anchor blabbering on about rising tensions between the Sovereignty and the U.S. \n");
		Timer.threeSeconds();
		TyperOne.Dad2();
		Timer.oneHalfSecond();
		decision5();
		}
	
		
	public static void decision5() {
		System.out.println("\n----------------------\n(1) 'Mutually Assured Destruction?'\n(2) ' They said something about the Sovereignty? What's that?' \n(3) 'Crap, I'm late for school. See you later'\n----------------------\n");
		
		switch(Introduction.in.nextLine()) {
		case "1":
			knowledge1 = 0;
			TyperOne.Mad();
			Timer.oneSecond();
			decision5();
			break;
			
		case "2":
			knowledge1 = 1;
			TyperOne.Sovereignty();
			Timer.oneSecond();
			decision5();
			break;
			
		case "3":
			knowledge1 = knowledge1 +0;
			TyperOne.Late();
			System.out.println();
			Timer.oneSecond();
			end();
			break;
			
		default:
			decision5();
		}
	}
	public static void end() {
		
		if (knowledge1 == 1){
			System.out.println("As you leave your house, you get a text from your friend, " +Introduction.bestFriendName);
			Timer.oneSecond();
			TyperOne.bestFriend1();
			Timer.oneSecond();
			TyperOne.youReply2();
			Timer.oneSecond();
			
		}
		if (knowledge1 == 0) {
			System.out.println("As you leave your house, you get a text from your friend, " +Introduction.bestFriendName );
			Timer.oneSecond();
			TyperOne.bestFriend1();
			Timer.oneHalfSecond();
			TyperOne.bestFriend2();
			System.out.println();
			TyperOne.youReply();
			Timer.oneSecond();
			
			
		}
		
		System.out.println("END OF CHAPTER 1:");
	}
		
	}
	
	
	

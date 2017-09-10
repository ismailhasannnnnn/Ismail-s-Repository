
public class chapterOne {				//replaced story.java
	
	public static int energy;
	public static int sleepiness = 8;
	public chapterOne() {
	}
	
	public static void Main() {
		
		Timer.oneSecond();
		System.out.println();
		System.out.println("\n\nPART ONE: HOME SWEET HOME \n");
		Timer.oneSecond();
		wakeup();
		
		
			
	}
	public static void wakeup() {
		TyperOne.wakeUp();
		Timer.oneSecond();
		System.out.println();
		System.out.println("You wake from your sleep"); 					// non dialogue stuff isn't typer 
		decision1();
	}
		
		
		
	
	public static void decision1() {
		
		System.out.println("What do you do? \n\n(1) Go back to sleep \n(2) Go downstairs ");
		
		
		switch(Introduction.in.nextLine()) {
		
		case "1":
			System.out.println("You drift slowly back to sleep, only to hear the same eerie voice when you wake up 8 hours later");
			System.out.println();
			Timer.oneSecond();
			
			sleepiness = sleepiness +8;
			wakeup();
			break;
			
		case "2":
			System.out.println("You go downstairs");
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
		Timer.oneSecond();
		
		if(Introduction.gender == 1 && sleepiness == 8) {
			TyperOne.Mom1Male();
			decision3();
			
		}
		if(Introduction.gender == 2 && sleepiness == 8) {
			TyperOne.Mom1Female();
			decision3();
		}
		if(sleepiness > 8) {
			TyperOne.Dad1();
			decision3();
		}
	}
	public static void decision3() {
		System.out.println("\n\n(1) Eat some breakfast \n(2) Skip breakfast and leave. You're late for school.");
		
		
		switch(Introduction.in.nextLine()) {
		
		case "1":
			energy = 3;
			System.out.println();
			decision4();
			break;
			
		
		case "2":
			energy = 0;
			TyperOne.MomDad1();
			System.out.println();
			decision4();
			break;
		
		default:
			decision3();
			
			
		}
	}
	public static void decision4() {
		
		if(energy == 0) {
			System.out.println("\nYou walk to school slowly, feeling more empty then ever. You regret skipping breakfast.");
		}
		if(energy == 3) {
			System.out.println("You hurry to school.");
		}
		}
		
	}

	

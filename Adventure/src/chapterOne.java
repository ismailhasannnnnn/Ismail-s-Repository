
public class chapterOne {				//replaced story.java
	
	public static int sleepiness = 8;
	public chapterOne() {
	}
	
	public static void Main() {
		
		Timer.oneSecond();
		System.out.println();
		System.out.println(" \n\n\nPART ONE: HOME SWEET HOME \n");
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
			Timer.oneSecond();
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
			
		}
		if(Introduction.gender == 2 && sleepiness == 8) {
			TyperOne.Mom1Female();
		}
		if(sleepiness > 8) {
			TyperOne.Dad1();
		}
	}
		
}
	

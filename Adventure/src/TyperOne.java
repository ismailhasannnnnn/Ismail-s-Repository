
public class TyperOne {  				
	
	public static String dlog;
	public TyperOne() {
	}
	
		public static void wakeUp() {
			dlog = "???: These violent delights have violent ends, " +Introduction.name + ".\n" ;
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void Mom1Male() {                                   // format (person) (dialogue number) (Integer (ex. gender))
			dlog = "Mom: Well look who finally came out of his cave! Come on, let's eat breakfast!";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void Mom1Female() {
			dlog = "Mom: Well look who finally came out of her cave! Come on, let's eat breakfast! ";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void Dad1() {
			dlog = "Dad: You've slept for more than " +chapterOne.sleepiness + " hours! Lets eat breakfast, or should I say, brunch!";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		
		public static void MomDad1() {
			dlog = "Mom: You're not gonna eat breakfast?         \nDad: Suit yourself, " +Introduction.name + ".";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void Dad2() {
			dlog = "Dad: They'd be stupid to try and nuke us. They ever heard of Mutually Assured Destruction?";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void Sovereignty() {
			dlog = "Dad: It's the North Korean-Russian alliance, obviously. What do they teach you in school?";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void Mad() {
			dlog = "Dad: Let's just say that the North Korea won't get second chance to nuke us. You know, cause they're dead.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}
		}
		public static void Late() {
			dlog = "Mom: " +Introduction.name + ", make sure to get home by 4, [Justin: I haven't figured out what the 'special event' is]  ";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}
		
}
}
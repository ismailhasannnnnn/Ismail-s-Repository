package Typers;
import Chapters.ChapterOne;
import Chapters.ChapterZero;
import Util.Timer;

public class TyperOne {  				
	
	public static String dlog;
	public TyperOne() {
	}
	
		public static void wakeUp() {
			dlog = "???: These violent delights have violent ends, " +ChapterZero.name + ".\n" ;
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
			dlog = "Dad: You've slept for more than " +ChapterOne.sleepiness + " hours! Lets eat breakfast, or should I say, brunch!";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		
		public static void MomDad1() {
			dlog = "Mom: You're not gonna eat breakfast?         \nDad: C'mon, you're already late for your classes anyway, " +ChapterZero.name + ".\n";
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
			dlog = "Dad: Let's just say that North Korea won't get a second chance to nuke us. You know, cause they're gonna be dead.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}
		}
		public static void Late() {
			dlog = "Mom: " +ChapterZero.name + ", make sure to get home by 6, we're gonna be ordering pizza!          \nDad: Pay attention in History class while you're there!\n";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}
		}
		public static void bestFriend1() {
			dlog = "["+ChapterZero.bestFriendName+"]: Yo. We're chilling at MoonBucks after school yea?\n";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}
}
		public static void bestFriend2() {
			dlog = "["+ChapterZero.bestFriendName+"]: Also, did u hear about North Korea? Seems really fuckin stupid.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
}
		}
		public static void youReply() {
			dlog = "[Me]: Yeah! I heard the news this morning! But anyways, yeah, I'm down for some coffee after school.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
}
		}
		public static void youReply2() {
			dlog = "[Me]: Sure. As long as it's boneless coffee. ;)";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
}
		}
}
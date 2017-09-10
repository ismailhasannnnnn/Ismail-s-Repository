
public class TyperOne {  				
	
	public static String dlog;
	public TyperOne() {
	}
	
		public static void wakeUp() {
			dlog = "???: Wake up \n";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void Mom1Male() {                                   // format (person) (dialogue number) (Integer (ex. gender))
			dlog = "Mom: Well look who finally came out of his cave!'";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void Mom1Female() {
			dlog = "Mom: Well look who finally came out of her cave! ";
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
}
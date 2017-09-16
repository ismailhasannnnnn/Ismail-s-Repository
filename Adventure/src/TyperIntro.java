
public class TyperIntro {
	
	public static String dlog;
	public TyperIntro() {
	}
	
		public static void intro() {
			 dlog= "Hi. This is your adventure.                    \nLet's start with a simple question.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
				
		}
		}
		
		public static void question() {
			dlog = "Are you male or female?";
			Timer.oneSecond();
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
				
		}
		}
		
		public static void selectMale()   {
			dlog= "I see, you are a male.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}
		}
		public static void selectFemale() {
			dlog =  "I see, you are a female.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}	
		}
		
		public static void genderFail() {
			dlog = "That is not a gender. Please try again.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}
		}
		public static void askName() {
			dlog = "What is your name?";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			
		}
		}
		public static void selectName() {
			dlog = "I see, your name is " + Introduction.name + ". How fitting!" ;
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}	
		}
		public static void theEnd() {
			dlog = "Listen, " + Introduction.name + ", it's getting dark. We should probably get going.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
		}
		}
		public static void theEnd2() {
			dlog = "\nFrom then on, nobody knew how incredibly gifted " + Introduction.name + " was.";
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			
		}
		}
		public static void maleEnd() {
			dlog = "Little did he know, a great threat would soon overwhelm America, and his life would be changed forever."; 
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
		public static void femaleEnd() {
			dlog = "Little did she know, a great threat would soon overwhelm America, and her life would be changed forever."; 
			for(int i = 0; i < dlog.length(); i++ ) {
				char c = dlog.charAt(i);
				System.out.print(c);
				Timer.TyperTime();
			}
			}
}
		
		
	
	




import java.util.Random;

public class Main {
	
	public static Random rand = new Random();
//	public static int length = rand.nextInt(26);
//	public static char c = (char)(rand.nextInt(26) + 'a');
	public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	public static int randomLeng;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print();

	}
	
	public static void print() {
		randomLeng = rand.nextInt(9) + 1;
		for(int i = 0; i < 4545; i++) {
			char blah = alphabet.charAt(rand.nextInt(26));
			System.out.print(blah);
		}
		
	}

}

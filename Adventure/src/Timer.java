
public class Timer {
	
	public Timer() {
		
	}
	
	public static void oneSecond() {
		try {
			Thread.sleep(1000);			// 1000
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void TyperTime() {
		try {
			Thread.sleep(30);			// 30
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void oneHalfSecond() {
		try {
			Thread.sleep(1500);			// 1000
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}
	public static void threeSeconds() {
		try {
			Thread.sleep(3000);			// 3000
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}
}

public class Timer {
	
	public Timer() {
		
	}
	
	public static void oneSecond() {
		try {
			Thread.sleep(1);			// 1000
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void TyperTime() {
		try {
			Thread.sleep(1);			// 30
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

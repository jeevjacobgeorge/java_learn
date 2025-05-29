package problem_set3;

public class ThreadExample {
	public static void main(String args[]) {
		// Runnable is an interface Now we can skip writing a class which implements Runnable and just use an anonymous class
		
		Runnable task = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello from thread");
			}
		};
		
		Thread t = new Thread(task);
		t.start();
	}
}

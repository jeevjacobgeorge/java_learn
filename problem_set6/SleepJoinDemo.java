package problem_set6;
//Demonstrate use of Thread.sleep() and Thread.join() with
//explanation. 

public class SleepJoinDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			System.out.println("Thread 1 starting...");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 1 done");
		});
		Thread t2 = new Thread(()->{
			System.out.println("Thread 2 waiting for thread1");
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread 2 finished");
		});
		t1.start();
		t2.start();
	}

}

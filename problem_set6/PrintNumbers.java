package problem_set6;
// Create a program that prints numbers 1 to 10 from two
// threads simultaneously. 
public class PrintNumbers {
    public static void main(String[] args) {
    	Thread t1 = new Thread(()->{
    		try {
				Thread.sleep(100);
				for(int i = 1; i < 11;i++) {
					System.out.println(i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    		
    	});
    	Thread t2 = new Thread(new Task());
    	t1.start();
    	t2.start();
    }
    static class Task implements Runnable{
    	public void run() {
			try {
				Thread.sleep(100);
				for(int i = 1; i < 11;i++) {
					System.out.println(i);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	}
    }
}

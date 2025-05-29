package problem_set6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Use ExecutorService to run 5 tasks concurrently that print thread names.
public class ThreadNamePrinter {
	
	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(5);
		Runnable task = () ->{
			System.out.println("Running in "+Thread.currentThread().getName());
		};
		for(int i = 0; i < 5;i++) {
			service.execute(task);
		}
		service.shutdown();
		
	}

}

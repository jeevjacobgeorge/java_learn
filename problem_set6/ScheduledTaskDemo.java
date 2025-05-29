package problem_set6;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//Use ScheduledExecutorService to schedule a task with
//delay and then with fixed rate
public class ScheduledTaskDemo {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		String fileURL = "https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf";
		String savePath = "src/problem_set6/dummy.pdf";
		Runnable task = new DownloadTask(fileURL, savePath);
		service.schedule(task, 3, TimeUnit.SECONDS);
		service.scheduleAtFixedRate(task, 5, 2, TimeUnit.SECONDS);
		
		service.schedule(()->{
			System.out.println("Shutting down");
			service.shutdown();
		},20,TimeUnit.SECONDS);
	}

}

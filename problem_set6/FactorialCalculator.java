package problem_set6;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//Write a Callable that calculates the factorial of a number
//and returns the result. Use Future to get the result. 
public class FactorialCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		FactorialTask task1 = new FactorialTask(n);
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<Long> futureAns = service.submit(task1);
		try {
			System.out.println(" Factorial of "+n+" is "+futureAns.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		
	}

}

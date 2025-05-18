package problem_set6;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Long> {
	private int no;
	
	public FactorialTask(int no) {
		this.no = no;
	}
	@Override
	public Long call(){
		long result = 1;
		for(int i = 2; i <= no;i++ ) {
			result *= i;
		}
		return result;
	}
}

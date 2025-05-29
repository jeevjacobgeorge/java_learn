package problem_set3;

public class LambdaFunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunction s1 = (x) -> {return x*x;};
		int result = s1.FindSquare(5);
		System.out.println(result);
	}

}

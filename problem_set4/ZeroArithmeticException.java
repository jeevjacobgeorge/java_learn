package problem_set4;

import java.util.Scanner;

public class ZeroArithmeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			int den = sc.nextInt();
			int result = num/den;
			System.out.println("Result:"+result);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		finally {
			sc.close();
		}
	}

}

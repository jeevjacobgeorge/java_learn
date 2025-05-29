package problem_set3;

public class MathUtil {
	
	public static class Power{
		public static double calculatePower(double no, int exponent) {
			if (no == 0 && exponent < 0) 
			    throw new ArithmeticException("Zero cannot be raised to a negative power.");
			
			if (exponent < 0) {
				no = 1/no;
				exponent *= -1;
			}
			
			double ans = 1;
			for(int i = 0;i <exponent;i++)
				ans *= no;
			
			return ans;
		}
	}
	public static void main(String args[]) {
		double ans = MathUtil.Power.calculatePower(2, -2);
		System.out.println(ans);
	}
}


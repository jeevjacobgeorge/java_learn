package problem_set3;

public class TestMathUtil{
    public static void main(String[] args) {
    	testCalculatePower(2, 3, 8);
        testCalculatePower(5, 0, 1);
        testCalculatePower(2, -2, 0.25);
        testCalculatePower(10, 1, 10);
        testCalculatePower(3, 4, 81);
        testCalculatePower(2, -3, 0.125);
        testCalculatePower(1, -100, 1);
        testCalculatePower(0.5, 2, 0.25);
    }
    public static void testCalculatePower(double base,int exp,double expected) {
    	double result = MathUtil.Power.calculatePower(base,exp);
    	System.out.printf("Testing %.2f^%d => Expected: %.5f,Got:%.5f %s\n",
    			base,exp,expected,result,
    			Math.abs(result-expected) < 1e-6 ? "👍Pass" : "❌Fail");
    }
}
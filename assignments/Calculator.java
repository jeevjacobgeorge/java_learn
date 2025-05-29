package assignments;

public class Calculator {
	public int x,y,res;
	public Calculator(int x,int y) {
		this.x = x;
		this.y = y;

	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public void add() {
		res = x+y;
	}
	public void subtract() {
		res = x-y;
	}
	public void multiply() {
		res = x*y;
	}
	public void divide() {
		res = x/y;
	}
	public void printResult() {
		System.out.println("Result:"+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator(3,4);
		c1.add();
		c1.printResult();
		c1.subtract();
		c1.printResult();
	}

}

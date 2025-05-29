package arithmetic_class_work;

public class TestArithmatics {
	public static void main(String args[]) {
		Arithmatics[] calculation = {new Adder(),new Subtractor(),new Multiplicator()};
		for (int i = 0; i <calculation.length;i++) {
			
			String res = calculation[i].process(9,6);
			System.out.println(res);
		}

	}
}

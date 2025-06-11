package class_work;

public class Computation {
	

	
	public static void main(String[] args) throws NotAGoodValueException {
		// TODO Auto-generated method stub
		int x = 0;
			
			System.out.println("Expecting a good value");
			x = Integer.parseInt(args[0]);
			if (x==13) {
				throw new NotAGoodValueException("It is a unlucky number");
			}
			System.out.println("A gray value");
			
			
			

		
	}

}

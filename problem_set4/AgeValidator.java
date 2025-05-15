package problem_set4;

public class AgeValidator {

	public static void validateAge(int age) throws AgeNotValidException  { //AgeNotValidException has been declared
		if (age<18) 
			throw new AgeNotValidException ("Age must be greater tha 18");
		else 
			System.out.println("Age is valid");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			validateAge(14);
		}
		catch(Exception e) {
			System.out.println("Validation error:"+e);
		}
	}

}

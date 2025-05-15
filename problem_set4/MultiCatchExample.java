package problem_set4;
//4. Use multiple catch blocks to handle ArrayIndexOutOfBoundsException and NumberFormatException. 
public class MultiCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] data = {"Jeev","Jacob","George"};
		try {
//			System.out.println(data[4]);
			int value = Integer.parseInt(data[2]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Error"+e);
		} catch (NumberFormatException e) {
			System.out.println("Error"+ e);
		}
	}

}

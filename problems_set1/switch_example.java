package problems_set1;
import java.util.Scanner;
public class switch_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		switch(n) {
		case 1: 
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		default:
			System.out.println("Invalid");
		}
	}

}

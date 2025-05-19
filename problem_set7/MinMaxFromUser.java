package problem_set7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//3. Read Input from User Using Scanner, Store Numbers in a List, Print Largest & Smallest
public class MinMaxFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of elements in array");
		int no = sc.nextInt();
		List<Integer> arr = new ArrayList<>();
		for(int i = 0; i < no; i++) {
			arr.add(sc.nextInt());
		}
		System.out.println("The array:"+arr);
		System.out.println("The Largest: "+Collections.max(arr));
		System.out.println("The Smallest: "+Collections.min(arr));
	}

}

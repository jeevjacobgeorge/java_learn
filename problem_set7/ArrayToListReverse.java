package problem_set7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//4. Convert an Array of Integers to a List and Reverse It
public class ArrayToListReverse {

	public static void main(String[] args) {
		Integer[] arr = {5,2,5,6,2,1};
		List<Integer> arrList = new ArrayList<>(Arrays.asList(arr));
		Collections.reverse(arrList);
        System.out.println("Reversed List:");
        System.out.println(arrList);
	}

}

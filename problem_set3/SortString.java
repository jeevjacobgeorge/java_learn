package problem_set3;

import java.util.Arrays;
import java.util.List;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] stringArray = {"Jeev","Anu","George","Jacob","G Venketeshwar"};
		Arrays.sort(stringArray,(a,b) -> a.compareTo(b));
        System.out.println("Sorted List: " + Arrays.toString(stringArray));
		List<String> names = Arrays.asList("Jeev","Anu","George","Jacob","G Venketeshwar");
		names.sort((a,b)->a.compareTo(b));
        System.out.println("Sorted List: " + names);
        
        for(String s: names) {
        	if(s.startsWith("A"))
        		System.out.println(s);
        }
	}

}

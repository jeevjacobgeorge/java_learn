
package problem_set7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//1. Create a List of Strings, Add 5 Names, and Sort Alphabetically
public class SortNames {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		list.add("Jeev");
		list.add("Jacob");
		list.add("George");
		list.add("Anu");
		list.add("Vishnu");
		Collections.sort(list,(a,b)->a.compareTo(b));
		System.out.println(list);
	}

}
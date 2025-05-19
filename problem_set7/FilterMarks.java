package problem_set7;

import java.util.HashMap;
import java.util.Map;

//2. Create a Map of Names and Marks, Print Names with Marks > 80
public class FilterMarks {

	public static void main(String[] args) {
		Map<String,Integer> marks = new HashMap<>();
		marks.put("Jeev", 69);
		marks.put("Jacob", 99);
		
		for(Map.Entry<String,Integer> entry: marks.entrySet()) {
			if (entry.getValue() > 80) {
				System.out.println(entry.getKey());
			}
		}
	}

}

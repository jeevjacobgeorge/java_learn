package problem_set7;
//5. Custom Sorting of Students by Marks (Descending)
import java.util.ArrayList;
import java.util.List;

public class SortStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Jeev",69));
		studentList.add(new Student("Jacob",95));
		studentList.add(new Student("Akshay",92));
		studentList.add(new Student("G Venketeshwar",79));

		//custom comparator
		studentList.sort((s1,s2) -> Integer.compare(s1.marks, s2.marks));
		
        System.out.println("Students sorted by marks (descending):"+studentList);
        
			
		
	}

}

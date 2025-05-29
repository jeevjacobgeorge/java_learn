package problem_set5;
/*Create a class Employee with a reference to a
Department object.
 Implement both shallow and deep clone, and
demonstrate the difference.*/
public class Employee implements Cloneable {
	String name;
	Department dept;
	public Employee(String name, Department dept) {
		super();
		this.name = name;
		this.dept = dept;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	protected Employee deepClone() {
		Department clonedDept = new Department(dept.name);
		return new Employee(name,clonedDept);
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + "]";
	}
	
	public static void main(String args[]) throws CloneNotSupportedException {
		Department d = new Department("CSE");
		Employee e = new Employee("Jeev",d);
		
		Employee shallowE = (Employee) e.clone();
		
		Employee deepE = e.deepClone();
		
	}
	
}

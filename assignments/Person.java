package assignments;

public class Person {
	 private int id;
	    private String name;
	    // private Address address; // java.util.Collection.
	    private Address[] address;

	    /*
	     * public Person(int id, String name, Address address) {
	     *     this.id = id;
	     *     this.name = name;
	     *     this.address = address;
	     * }
	     */

	    public Person(int id, String name, Address[] address) {
	        this.id = id;
	        this.name = name;
	        this.address = address;
	    }

	    public void info() {
	        System.out.println(id + "," + name);
	        for (Address add : address)
	            System.out.println(add);
	    }
}

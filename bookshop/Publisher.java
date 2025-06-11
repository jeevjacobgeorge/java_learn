package bookshop;

public class Publisher {
	private String name;
	private String address;
	
	public Publisher(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Publisher [name=" + name + ", address=" + address + "]";
	}
	
}

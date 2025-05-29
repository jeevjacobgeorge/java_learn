package ecommerce;

public class Product extends Item {
	private double price;
	public Product (String name,double price) {
		super(name);
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product Name:"+ super.getName() + "[price=" + price + "]";
	}
}

package ecommerce;



public class ConsignmentClass {
	private Product[] products;
	private int lastIndex;
	public ConsignmentClass() {
		products = new Product[100];
		lastIndex = 0;
	}
	
	public void addProduct(Product p) throws Exception {
		if (lastIndex<products.length-1)
			products[lastIndex++] = p;
		else
			throw new Exception("Consingment full");
	}
	
	
	public void show() {
		for (int i=0; i < lastIndex ; i++) {
			System.out.println(products[i]);
		}
	}
}

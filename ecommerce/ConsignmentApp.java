package ecommerce;

public class ConsignmentApp {
	public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1000.0);
        Product p2 = new Product("Phone", 500.0);
        
        ConsignmentClass c = new ConsignmentClass();
        try {
        	c.addProduct(p1);
        	c.addProduct(p2);        	
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        
        c.show();
        
	}
}

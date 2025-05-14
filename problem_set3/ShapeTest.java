package problem_set3;

public class ShapeTest {
    public static void main(String[] args) {
    	Shape circle = new Shape() {
    		@Override
    		public void draw() {
    			System.out.println("Drawing a circle");
    		}
    		
    	};
    	circle.draw();
    }
    
}

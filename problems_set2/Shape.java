package problems_set2;

public abstract class Shape {
	public abstract int area();
}
interface Drawable{
	void draw();
}
class Circle extends Shape implements Drawable{
	public int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	@Override
	public int area() {
		return radius*radius;
	}
	@Override
	public void draw() {
		
	}
}
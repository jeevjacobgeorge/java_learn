package problems_set2;

public class car {
		private String brand;
		private String model;
		private int year;
		private int speed;

		public car(String brand, String model, int year, int speed) {
			this.brand = brand;
			this.model = model;
			this.year = year;
			this.speed = speed;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}
		public int getSpeed() {
			return speed;
		}
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		public String toString() {
			return brand + " " + model + " (" + year + "), Speed: " + speed + " km/h";
		}
		public void accelerate() {
			speed+=10;
			System.out.println("Accelerated:"+ speed);
		}
		public static void main(String args[]) {
			car c1 = new car("Toyota","f1",1998,10);
			System.out.println(c1);
			c1.accelerate();
		}
}

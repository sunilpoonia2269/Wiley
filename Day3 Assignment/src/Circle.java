
public class Circle {
	private int radius;
	private double area;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public double getArea() {
		return area;
	}
	
	public double calculateArea() {
		return 3.14 * this.radius * this.radius;
	}

}

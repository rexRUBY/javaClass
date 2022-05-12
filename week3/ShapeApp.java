package exercise;

interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.println("---다시 그립니다.---");
		draw();
	}
}

class Circle implements Shape{
	private int radius;
	
	public Circle(int n) {
		this.radius=n;
	}
	
	@Override
	public void draw() {
		System.out.print("반지름은 "+radius);
	}
	
	@Override
	public double getArea() {
		return radius*radius*PI;
	}
	
}
public class ShapeApp {
	public static void main(String[] args) {
		Shape coin = new Circle(10);
		coin.redraw();
		System.out.println(" 코인의 면적은 "+coin.getArea());
	}
}

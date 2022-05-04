package exercise;

class Circle{
	private int radius;
	public Circle (int radius) { this.radius=radius; } //constructor
	public int getRadius() { return radius; } //getter
}
public class NamedCircle extends Circle {
	String name;
	public NamedCircle(int radius, String name) {
		super(radius);
		this.name=name;
	}
	public void show() {
		System.out.print(name+" 반지름=");
		System.out.print(getRadius());
	}
	
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5,"waffle");
		w.show();
	}
}

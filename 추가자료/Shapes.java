package Exercise;

public interface Shape {
	final double PI=3.14;
	void draw();
	double getArea();
	default public void redraw() {
		System.out.print("-------다시 그립니다.");
		draw();
	}
}

class Circle implements Shape{
	int r;
	public Circle(int r){
		this.r=r;
	}
	public void draw() {
		System.out.println("반지름이 "+r+"인 원입니다.");
	}
	public double getArea() {
		return r*PI;
	}
}
class Oval implements Shape{
	int r1, r2;
	public Oval(int r1, int r2) {
		this.r1=r1;
		this.r2=r2;
	}
	public void draw() {
		System.out.println(r1+"x"+r2+"에 내접하는 타원입니다.");
	}
	public double getArea() {
		return r1*r2*PI;
	}
}
class Rect implements Shape{
	int r1,r2;
	public Rect(int r1, int r2) {
		this.r1=r1;
		this.r2=r2;
	}
	public void draw() {
		System.out.println(r1+"x"+r2+"크기의 사각형 입니다.");
	}
	public double getArea() {
		return r1*r2;
	}
}

public class Shapes{
	public static void main(String[] args) {
		Shape [] list = new Shape[3];
		list[0]=new Circle(10);
		list[1]=new Oval(20,30);
		list[2]=new Rect(10,40);
		
		for(int i=0; i<list.length; i++)
			list[i].redraw();
		for(int i=0; i<list.length; i++) {
			System.out.println("면적은 "+list[i].getArea());
		}
	}

}

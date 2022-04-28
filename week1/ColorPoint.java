package exercise;

class Point{
	protected int x,y;
//	public Point(int x, int y) {
//		this.x=x;
//		this.y=y;
//	}
	public int getX() {return x;}
	public int getY() {return y;}
	
	protected void move(int x, int y) {
		this.x=x; this.y=y;
	}
}


public class ColorPoint extends Point{
	private String color;
	ColorPoint(int x, int y, String color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	public void setPoint(int x, int y) {
		move(x,y);
	}
	void setColor(String color) {this.color=color;}
	void show() {
		System.out.println(color+"색으로"+"("+x+","+y+")");
	}
	
	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5,"Yellow");
		cp.setPoint(10,20);
		cp.setColor("GREEN");
		cp.show();
	}

}
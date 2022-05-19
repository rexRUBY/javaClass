package Exercise;

public class MyPoint {
	int x,y;
	
	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String toString(){
		return getClass().getName()+"("+x+","+y+")";
	}

	public static void main(String[] args) {
		MyPoint a = new MyPoint(3,20);
		System.out.println(a); //레퍼런스를 넣으면 투스트링 알아서 호출
	}
}

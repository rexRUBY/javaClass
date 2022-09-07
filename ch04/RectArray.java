import java.util.*;
public class RectArray {
	public static void main(String[] args) {
		Rect[] classArr = new Rect[4];
		int sum=0;
		int w,h;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++)
		{
			System.out.print(i+1+" 너비와 높이 >> ");
			w=sc.nextInt();
			h=sc.nextInt();
			classArr[i] = new Rect(w, h);
			sum+=classArr[i].getArea();
		}
		System.out.println("저장하였습니다.\n"+"사각형의 전체 합은 "+sum);
	}
}

class Rect {
	private int width, height;
	public Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	public int getArea() {
		return width*height;
	}
}

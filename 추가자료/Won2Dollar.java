package exercise;
import java.util.*;

abstract class Converter{
	abstract protected double convert(double src); //추상메서드
	abstract protected String srcString();
	abstract protected String destString();
	protected double ratio;

	public void run() {
		Scanner scanner = new Scanner(System.in);
		System.out.println(srcString()+"을 "+ destString()+"로 바꿉니다.");
		System.out.println(srcString()+"을 입력하세요>> ");
		double val=scanner.nextDouble();
		double res = convert(val);
		System.out.println("반환 결과: "+res+destString()+"입니다.");
		scanner.close();
	}
}
public class Won2Dollar extends Converter {
	public Won2Dollar(int w) {
		this.ratio=w;
	}
	protected double convert(double src) {
		return src/ratio;
	} 
	protected String srcString() {
		return "원";
	}
	
	protected String destString() {
		return "달러";
	}
	
	public static void main(String[] args) {
		Won2Dollar toDollar=new Won2Dollar(1200);
		toDollar.run();
	}
}

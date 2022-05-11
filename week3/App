package exercise;
import java.util.Scanner;

abstract class Calculator{
	protected int a, b;
	abstract protected int calc(); //추상 메서드
	protected void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 두 개를 입력하세요>> ");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	
	public void run() {
		input();
		int res=calc();
		System.out.println("계산된 값은"+res);
	}
}

class Adder extends Calculator {
	protected int calc() {
		return a+b;
	}
}

class Subtractor extends Calculator{
	protected int calc(){
		return a-b;
	}
}

public class App {
	public void main(String[] args) {
		Adder adder=new Adder();
		Subtractor sub =new Subtractor();
		
		adder.run();
		sub.run();
	}
}

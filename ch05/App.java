//5장 실습문제 3번
import java.util.*;

abstract class Calculator{
    protected int a, b;
    abstract protected int calc();  //추상메서드
    protected void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 두 개를 입력하세요 >> ");
        a = sc.nextInt();
        b = sc.nextInt();
    }
    public void run(){
        input();
        int res =calc();
        System.out.println("계산된 값은? "+res);
    }
}

class Adder extends Calculator {
    @Override
    protected int calc(){
        return a+b;
    }
}

class Subtracter extends Calculator {
    @Override
    protected int calc(){
        return a-b;
    }
}

public class App {
    public static void main(String[] args) {
        Adder adder = new Adder();
        Subtracter sub = new Subtracter();

        adder.run();
        sub.run();
    }
}
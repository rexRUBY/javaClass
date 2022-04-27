import java.util.Scanner;

class Day {
	private String work; //하루의 할 일을 나타내는 문자열
	public void set(String work) { this.work=work; }
	public String get() { return work; }
	public void show() {
		if(work==null) System.out.println("없습니다.");
		else System.out.println(work+"입니다.");
	}
}


public class MonthSchedule {
	Scanner scanner = new Scanner(System.in);
	Day day[];  //Day객체 배열
	
	public MonthSchedule(int n) {
		day=new Day[n];
		for(int i=0; i<n; i++) //객체배열 초기화
			day[i]=new Day();
		System.out.println("이번달 스케줄 관리 프로그램");
	}
	
	public void input() {
		System.out.print("날짜(1~30) ? ");
		int date=scanner.nextInt();
		System.out.print("할일(빈칸없이 입력)? ");
		String todo=scanner.next();
		day[date-1].set(todo);
	}
	
	public void view() {
		System.out.print("날짜(1~30) ? ");
		int date=scanner.nextInt();
		System.out.print(date+"일의 할 일은 ");
		day[date-1].show();
	}
	
	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}
	
	public void run() {
		while(true) {
			System.out.print("할 일 (입력:1, 보기:2, 끝내기:3) >>");
			int choice=scanner.nextInt();
			if(choice==1)
				input();
			else if(choice==2)
				view();
			else if(choice==3)
				finish();
			else
				System.out.println("잘못 입력하셨습니다.");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}

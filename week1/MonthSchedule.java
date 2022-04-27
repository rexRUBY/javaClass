import java.util.Scanner;

class Day {
	private String work; //�Ϸ��� �� ���� ��Ÿ���� ���ڿ�
	public void set(String work) { this.work=work; }
	public String get() { return work; }
	public void show() {
		if(work==null) System.out.println("�����ϴ�.");
		else System.out.println(work+"�Դϴ�.");
	}
}


public class MonthSchedule {
	Scanner scanner = new Scanner(System.in);
	Day day[];  //Day��ü �迭
	
	public MonthSchedule(int n) {
		day=new Day[n];
		for(int i=0; i<n; i++) //��ü�迭 �ʱ�ȭ
			day[i]=new Day();
		System.out.println("�̹��� ������ ���� ���α׷�");
	}
	
	public void input() {
		System.out.print("��¥(1~30) ? ");
		int date=scanner.nextInt();
		System.out.print("����(��ĭ���� �Է�)? ");
		String todo=scanner.next();
		day[date-1].set(todo);
	}
	
	public void view() {
		System.out.print("��¥(1~30) ? ");
		int date=scanner.nextInt();
		System.out.print(date+"���� �� ���� ");
		day[date-1].show();
	}
	
	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	
	public void run() {
		while(true) {
			System.out.print("�� �� (�Է�:1, ����:2, ������:3) >>");
			int choice=scanner.nextInt();
			if(choice==1)
				input();
			else if(choice==2)
				view();
			else if(choice==3)
				finish();
			else
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}

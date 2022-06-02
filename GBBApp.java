package Exercise;
import java.util.*;

public class GBBApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		final String s[] = {"가위","바위","보"};
		int userChoice, computerChoice;
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3), 끝내기(4)>> ");
			computerChoice=(int)Math.random()*3;
			userChoice = sc.nextInt();
			if(userChoice==4)
				break;
			System.out.println("사용자 "+s[userChoice-1]+" 컴퓨터 "+s[computerChoice]);
			int adt=userChoice-(computerChoice+1);
			if(adt==2)
				System.out.println("졌습니다.");
			else if(adt>0)
				System.out.println("이겼습니다.");
			else if(adt<0)
				System.out.println("졌습니다.");
			else
				System.out.println("비겼습니다.");
				
		}
		System.out.println("게임을 종료합니다...");
		sc.close();

	}

}

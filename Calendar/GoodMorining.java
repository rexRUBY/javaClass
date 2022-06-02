package calendar;

import java.util.Calendar;

public class GoodMorning {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		if(now.get(Calendar.HOUR_OF_DAY)>4 && now.get(Calendar.HOUR_OF_DAY)<12)
			System.out.println("Good Morning");
		else if(now.get(Calendar.HOUR_OF_DAY)<18 && now.get(Calendar.HOUR_OF_DAY)>12)
			System.out.println("Good Afternoon");
		else if(now.get(Calendar.HOUR_OF_DAY)>18 && now.get(Calendar.HOUR_OF_DAY)<22)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
			
	}

}

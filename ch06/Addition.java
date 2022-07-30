package Exercise;
import java.util.*;

public class Addtion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		int sum=0;
		StringTokenizer stn=new StringTokenizer(str, "+");
		
		while(stn.hasMoreTokens()) {
			String s = stn.nextToken();
			s=s.trim();
			sum+=Integer.parseInt(s);
		}
		System.out.println("합은 "+sum);
	}
}

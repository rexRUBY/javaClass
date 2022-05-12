package exercise;
import java.util.Scanner;

class StackManager{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringStcak st = new StringStcak(5);
		System.out.println(">>");
		
		for(int i=0; i<5; i++)
		{
			st.push(sc.next());
		}
		
		for(int i=0; i<5; i++)
		{
			System.out.print(st.pop()+" ");
		}
	}
}

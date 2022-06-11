//5장 실습문제 5번
import java.util.Scanner;

interface StackInterface {
    int length();
    String pop();
    boolean push(String ob);
}

public class StringStcak implements StackInterface{
    private String[] element;
    private int index;
    public StringStcak (int capacity) { //constructor
        element = new String[capacity];
        index=0;
    }
    @Override
    public int length() {
        return index;
    }
    @Override
    public String pop() {
        if(index==0)
            return null;
        index--;
        return element[index];
    }
    @Override
    public boolean push(String ob) {
        if(index==element.length)
            return false;
        element[index++]=ob;
        return true;
    }
}

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

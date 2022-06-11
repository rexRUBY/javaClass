//5장 실습문제 1번
class Circle {
    private int radius;
    public Circle(int radius){ this.radius=radius; }
    public int getRadius() { return radius; }
}
public class NamedCircle extends Circle{
    String name;
    public NamedCircle(int r, String n){
        super(r);
        this.name=n;
    }
    public void show(){
        System.out.println(name+", 반지름="+getRadius());
    }
   
    public static void main(String[] args){
        NamedCircle w = new NamedCircle(5,"Waffle");
        w.show();
    }
}

//5장 실습문제 4번
class Point{
    private int x,y;
    public Point(int x, int y){ this.x=x; this.y=y; }
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y){ this.x=x; this.y=y; }
}

public class ColorPoint extends Point{
    String color;
    public ColorPoint(int x, int y, String c){
        super(x,y);
        this.color=c;
    }
    public void setColor(String c){
        color=c;
    }
    public void setPoint(int x, int y){
        move(x,y);
    }
    public void show(){
        System.out.println(color+"색으로 ("+getX()+", "+getY()+")");
    }
    public static void main(String[] args){
        ColorPoint cp = new ColorPoint(5,5,"YELLOW");
        cp.setPoint(10,20);
        cp.setColor("Green");
        cp.show();
    }
}

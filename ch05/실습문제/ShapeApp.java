//5장 실습문제 보너스
interface Shape{
    final double PI=3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.println("--- 다시 그립니다. ---");
        draw();
    }
}

class Circle implements Shape{
    int radius;
    public Circle(int r) {
        this.radius=r;
    }
    @Override
    public void draw() {
        System.out.println("반지름 "+radius);
    }
    @Override
    public double getArea() { return radius*radius*PI; }
}

public class ShapeApp{
    public static void main(String[] args){
        Shape coin = new Circle(10);
        coin.redraw();
        System.out.println("코인의 면적은 "+coin.getArea());
    }
}

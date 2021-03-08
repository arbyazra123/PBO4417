
public class TestSimpleCircle{

    public static void main(String[] args){
        SimpleCircle sc = new SimpleCircle(5.0);
        System.out.println(sc.getArea());
        sc.setRadius(10.0);
        System.out.println(sc.getArea());
        SimpleCircle sc2 = new SimpleCircle(18.0);
        System.out.println(sc2.getArea());
        sc2.setRadius(2.0);
        System.out.println(sc2.getArea());

    }
}

class SimpleCircle{
    private double radius=1;
    private final double pi = 3.14;

    SimpleCircle(){}
    SimpleCircle(double radius){
        this.radius = radius;
    }

    double getArea(){
        return (radius*radius) * pi;
    }

    double getPerimeter(){
        return 2*radius*pi;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

}
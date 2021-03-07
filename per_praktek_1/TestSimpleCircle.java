
public class TestSimpleCircle{

    public static void main(String[] args){
        SimpleCircle sc = new SimpleCircle(5.0);
        System.out.println(sc.radius);
        sc.setRadius(10.0);
        System.out.println(sc.radius);

    }
}

class SimpleCircle{
    double radius=1;
    final double pi = 3.14;

    SimpleCircle(){}
    SimpleCircle(double radius){
        this.radius = radius;
    }

    double getArea(){
        return (radius*radius) * 3.14;
    }

    double getPerimeter(){
        return 2*radius*3.14;
    }

    void setRadius(double radius){
        this.radius = radius;
    }

}
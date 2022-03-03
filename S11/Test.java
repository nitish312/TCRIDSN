/*
                  Shape
                shape_info()
Rectangle                           Circle
rectangle_info()                    circle_info()
 */
class Shape{
    public void shape_info(){
        System.out.println("I am any Shape..");
    }
}

class Rectangle extends Shape{
    public void Rectangle_info(){
        System.out.println("I am Rectangle..");
    }
}

class Circle extends Shape{
    public void Circle_info(){
        System.out.println("I am Circle..");
    }
}

public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.shape_info();
        r.Rectangle_info();

        Circle c = new Circle();
        c.shape_info();
        c.Circle_info();
    }
}
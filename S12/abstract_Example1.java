//abstract class
abstract class Shape
{
    abstract void draw();           //declaration of abstract method
}

class Rectangle extends Shape
{
    void draw(){
        System.out.println("drawing Rectangle");
    }
}

class Circle extends Shape
{
    void draw(){
        System.out.println("drawing Circle");
    }
}

class Triangle extends Shape
{
    void draw(){
        System.out.println("drawing Triangle");
    }
}


public class abstract_Example1 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();

        Rectangle r = new Rectangle();
        r.draw();
    }
}

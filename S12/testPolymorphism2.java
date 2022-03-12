class Shape {
    void draw () {
        System.out.println("drawing ...");
    }
}

class Rectangle extends Shape
{
    void draw () {
        System.out.println("drawing Rectangle ");
    }
}

class Circle extends Shape
{
    void draw () {
        System.out.println("drawing Circle ");
    }
}

class Triangle extends Shape
{
    void draw () {
        System.out.println("drawing Triangle ");
    }
}

public class testPolymorphism2 {
    public static void main(String[] args) {
        Shape s ;

        s= new Rectangle();
        s.draw();

        s= new Circle();
        s.draw();

        s= new Triangle() ;
        s.draw();
    }
}

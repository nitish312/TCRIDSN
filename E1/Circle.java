package Exercises;
// Q1
public class Circle 
{
    double radius, pi = 3.14;
    Circle()
    {
        radius = 0;
    }
    Circle(double r)
    {
        radius = r;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return pi * radius * radius;
    }
    
    public static void main(String[] args) 
    {
        Circle c = new Circle(4.5);
        System.out.println("Radius of Circle = "+c.getRadius());
        System.out.println("Area of Circle = "+c.getArea());
    }
}
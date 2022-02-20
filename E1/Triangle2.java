package Exercises;
// Q8
public class Triangle2
{
    double side1, side2, side3, height = 4;
    Triangle2(double side1, double side2, double side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double funArea()
    {
        return ((side1 * height)/2);
    }
    double funPeri()
    {
        return (side1 + side2 + side3);
    }
    public static void main(String[] args) 
    {
        Triangle2 t = new Triangle2(3,4,5);
        System.out.println("Area of Triangle = "+t.funArea());
        System.out.println("Perimeter of Triangle = "+t.funPeri());
    }
}
package Exercises;
// Q7
public class Triangle1
{
    public static void main(String[] args) 
    {
        double height=2.5, base=5, area, side1=3, side2=4, peri;
        area = (base * height)/2;
        peri = base + side1 + side2;
        System.out.println("Area of Triangle = "+area);
        System.out.println("Perimeter of Triangle = "+peri);
    }
}
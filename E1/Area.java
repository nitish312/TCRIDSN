package Exercises;
// Q6
import java.util.Scanner;
public class Area 
{
    double length, breadth, area;
    Scanner sc = new Scanner(System.in);
    void setDim()
    {
        System.out.print("Enter length = ");
        length = sc.nextDouble();
        System.out.print("Enter breadth = ");
        breadth = sc.nextDouble();
    }
    double getArea()
    {
        area = length * breadth;
        return area;
    }
    public static void main(String[] args) 
    {
        Area a = new Area();
        a.setDim();
        System.out.println("Area of Rectangle = "+a.getArea());
    }
}
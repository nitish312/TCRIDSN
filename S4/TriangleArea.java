import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base, height, area ;

        System.out.println("Enter base ");
        base = scan.nextDouble();

        System.out.println("Enter height ");
        height = scan.nextDouble();

        area = (base * height)/2;

        System.out.println("Area of Triangle is =" + area);
    }
}


// area of circle
//area of rectangle

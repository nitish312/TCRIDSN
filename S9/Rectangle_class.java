/* The Rectangle class stores and manipulates data for a rectangle. */
class Rectangle
{
    private double length;
    private double width;

    /*The set method accepts two arguments which are stored
    in the length and width fields */
    public void set(double l, double w)
    {
        length = l;
        width  = w;
    }

    /*The getArea method computes and returns the area */
    public double getArea()
    {
        return length * width;
    }

    /* The getPerimeter method computes and returns the perimter    */
    public double getPerimeter()
    {
        return 2 * (length + width);
    }
}

/*This program test the Rectangle class methods. */
class Rectangle_class
{
    public static void main(String[] args)
    {
        // Create a Rectangle object
        Rectangle rectangle1 = new Rectangle();

        // Accessing class members
        rectangle1.set(4.2, 6.2);
        System.out.println("Area of Rectangle is "+ rectangle1.getArea());
        System.out.println("Perimeter of Rectangle is "+ rectangle1.getPerimeter());
    }
}
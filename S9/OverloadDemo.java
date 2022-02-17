/* Overloading methods
    In Java it is possible to define two or more methods having same name
    within the same class, as long as their parameter declarations are different.
     When this is the case, the methods are said to be overloaded,
     and the process is referred to as method overloading.
     Overloaded methods must differ in the type and/or number of their parameters.
     When Java encounters a call to an overloaded method, the method whose arguments
     match, is called. Here is a simple example that demonstrate method overloading:
 */

/*This class demonstrate method overloading. */
class Overload
{
    void display()
    {
        System.out.println("No parameters");
    }

    // Overload display for one integer parameter.
    void display(int a)
    {
        System.out.println("a: " + a);
    }

    // Overload display for two integer parameters.
    void display(int a, int b)
    {
        System.out.println("a and b: " + a + " " + b);
    }

    // overload display for a double parameter
    void display(double a)
    {
        System.out.println("double a: " + a);
    }
}

class OverloadDemo
{
    public static void main(String[] args)
    {
        Overload ref = new Overload();

        // call all versions of display()
        ref.display();
        ref.display(100);
        ref.display(100, 200);
        ref.display(100.25);
    }
}
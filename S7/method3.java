import java.util.function.DoubleToIntFunction;

//method overloading : having same name for number of methods with
// different parameters or number of parameters.
public class method3 {
    public static int add(int a, int b )
    {
        return a+b ;
    }

    public static int add(int a, int b ,int c )
    {
        return a+b+c ;
    }

    public static float add(float a, float b )
    {
        return a+b ;
    }

    public static float add(float a, float b ,float c )
    {
        return a+b+c ;
    }












    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(10,20,45));
        System.out.println(add(10.4f,20.50f,45.20f));
    }
}

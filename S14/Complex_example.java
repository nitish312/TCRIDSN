class Complex {
    int real;
    int imag ;

    public Complex(int r, int i)
    {
        real = r;
        imag= i;
    }

    public int add()
    {
        return real+ imag ;
    }

    public int difference()
    {
        return real- imag ;
    }
    public int product()
    {
        return real*imag ;
    }
}

public class Complex_example {
    public static void main(String[] args) {
        Complex c = new Complex (10,20);
        System.out.println("Complex add" + c.add());
        System.out.println("Complex difference" + c.difference());
        System.out.println("Complex product" + c.product());

       // Complex c1[4] ;
        Complex [] obj = new Complex[4] ;


    }
}
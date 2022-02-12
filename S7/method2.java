public class method2 {
    //defining function with parameters and return value
    public static int addition(int a, int b){
        int sum = a+b;
        return sum;
    }

    public void show()      //instance method
    {

    }

    public static int sub (int a, int b)
    {
        int sub = a - b;
        return sub;
    }

    public static void main(String[] args) {
        int total = addition(10,20);
        System.out.println("total =" + total);

        total = addition(total,200);
        System.out.println("total =" + total);

        total = sub (50, 10);
        System.out.println ("subtraction is " + total);
    }
}
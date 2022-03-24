public class exception5 {
    public static void main(String[] args) {

       try{
            int a [] = new int[7];
            a[3] = 30/0 ;
            System.out.println("first print statement in try block");
       }
       catch (ArithmeticException ex){
           System.out.println("error : divide a  number by zero");
       }
       catch (ArrayIndexOutOfBoundsException ex){
           System.out.println("error : Array index out of size");
       }
       catch (Exception ex){
           System.out.println("some other exception");
       }
    }
}

public class finally_example {
    public static void main(String[] args) {

        try{
            int num = 10/0 ;
            System.out.println(num);
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
        finally {
            System.out.println("finally");
        }
    }
}

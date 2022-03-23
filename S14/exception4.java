import java.util.Scanner;

public class exception4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");

        int num1 = sc.nextInt();

        try{
            int num2 = 10/num1 ;
            System.out.println(num2);
        }
        catch (ArithmeticException ex){
            System.out.println("Please enter the correct input ");
        }
        System.out.println("This statement is outside try-catch block");
    }
}

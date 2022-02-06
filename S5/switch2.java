//simple calculator
import java.util.Scanner;
public class switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first, second, result=0;
        char op ;

        System.out.println("enter two numbers");
        first = sc.nextDouble();
        second= sc.nextDouble();

        System.out.println("enter operator (+,-,*,/)");
        op =sc.next().charAt(0);        // to take single character from user


        switch (op)
        {
            case '+':
                result = first + second ;
                break;
            case '-':
                result = first - second ;
                break;
            case '*':
                result = first * second ;
                break;
            case '/':
                result = first/ second ;
                break;
            default:
                System.out.println("invalid operator ");
        }
        System.out.println("Result =" + result);
    }
}

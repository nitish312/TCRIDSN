import java.util.Scanner;

public class if_logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3 ;

        System.out.println("please enter 3 values : ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        if( (num1>num2) && (num1 >num3) )
        {
            System.out.println("first number is greater than second and third number ");
        }
        else if( (num2 > num1) && (num2 >num3))
        {
            System.out.println("second number is greater than first and third number ");
        }
        else {
            System.out.println("third number is greater than first and second number ");
        }
    }
}

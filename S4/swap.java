// swap two numbers
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, temp ;

        System.out.println("Enter two numbers");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        temp = num1;
        num1 = num2;
        num2 =temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}

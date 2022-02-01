// Addition of two numbers
import java.util.Scanner ;

public class additionNums {
    public static void main(String[] args) {
        int first, second,sum ;

        Scanner sc = new Scanner(System.in);

        System.out.println("please enter first number");
        first = sc.nextInt();

        System.out.println("please enter second number");
        second = sc.nextInt();

        sum= first + second ;
        System.out.println("Sum of two numbers :" +sum);
    }

}

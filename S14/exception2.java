import java.util.Scanner;
//try catch block
public class exception2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = sc.nextInt();

        try {
            int ans = 10/num ;
            System.out.println(ans);
        }
        catch (Exception ex)
        {
            System.out.println("Please enter the correct input");
        }

        System.out.println("this statement is outside try-catch block");
    }
}

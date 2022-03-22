import java.util.Scanner;
//without exception
public class exception1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = sc.nextInt();

        int ans = 10/num ;
        System.out.println(ans);
    }
}
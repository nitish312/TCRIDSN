// multiplication table of given number
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i=1;

        while(i<=10)
        {
            //System.out.println(num + " * " + i + " = " + num*i);
            System.out.println(num*i);
            i++;
        }
    }
}
/*8 * 1       8
8 * 2       16
8 * 3       24
8 * 10      80
 */


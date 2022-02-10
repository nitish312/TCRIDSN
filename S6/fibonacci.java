/*fibonacci series
// series where the next number is the sum of the previous two numbers,

10
0 1 1 2 3 5 8 13 21  34
 */

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1=0, t2=1 ;

        System.out.println("Enter the number");
        int n = sc.nextInt();

        int i=1 ;
        while(i<=n){
            System.out.println(t1 + " " );
            int sum = t1 +t2;
            t1= t2;
            t2= sum;
            i++ ;
        }
    }
}

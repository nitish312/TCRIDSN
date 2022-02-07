// factorial of given number


import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter number ");
        int num = sc.nextInt();
        int fact = 1;
        int i=1;

        while(i<=num)
        {
            fact= fact * i;
            i++;
        }
        System.out.println("factorial of given number is =" + fact);

    }
}

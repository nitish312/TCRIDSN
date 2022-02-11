// sum of natural numbers as per user input
//for loop

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i =0;i<=num;i++){
            sum = sum + i;
        }
        System.out.println("Sum of the natural number is "+ sum);
    }
}

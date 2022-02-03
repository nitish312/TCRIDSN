/* calculate simple interest
Principal Amount
Interest rate
Term
simple_interest = (p*r*t)/100
*/

import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Principal Amount then Interest rate and Term ");
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();

        double si = (p * r * t)/ 100;
        System.out.println("Simple interest = "+ si);
    }
}


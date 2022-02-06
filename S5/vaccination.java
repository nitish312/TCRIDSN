/* program to take age from user
and display for which  vaccination program that person is eligible

more than 60        senior citizen vaccination
18 -60              citizen vaccination
15-18               child vaccination
 */

import java.util.Scanner;

public class vaccination {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age;
        System.out.println("Please enter the age");
        age =sc.nextInt();
        if (age>60)
        {
            System.out.println("senior citizen vaccination");
        }
        else if (age>=18 && age<=60)
        {
            System.out.println("citizen vaccination");
        }
        else if(age>=15 && age<18)
        {

            System.out.println("Child Vaccination");
        }
        else
        {
            System.out.println("your are a child you will get it later");
        }
    }
}

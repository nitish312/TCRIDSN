// input 5 subjects marks from user and calculate total and average
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int english, chemistry, computers , physics, maths , total ;
        float average ;

        Scanner sc = new Scanner(System.in);
        // System.out.println("Please enter the five subjects marks");

        System.out.println("Please    marks for english");
        english= sc.nextInt();

        System.out.println("Please    marks for chemistry");
        chemistry= sc.nextInt();

        computers= sc.nextInt();
        physics= sc.nextInt();
        maths= sc.nextInt();

        total = english + chemistry + computers + physics + maths;
        average = total /5;

        System.out.println("Total marks : " + total);
        System.out.println("Average : " + average);
    }
}

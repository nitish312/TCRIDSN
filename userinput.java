import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter an integer");

        int num =sc.nextInt();
        System.out.println("you entered " + num);

        System.out.println("enter an price");
        float price =sc.nextFloat();
    }
}
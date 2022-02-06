import java.util.Scanner;

public class if_else_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter marks : ");
        int marks = sc.nextInt();

        if(marks >75)
        {
            //condition true
            System.out.println("First division ...!!!");
        }
        else {
            //condition false
            System.out.println("Second division ...!!!");
        }
    }
}

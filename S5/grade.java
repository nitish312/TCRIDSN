import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter score");
        int score = sc.nextInt();

        if(score>=90){
            System.out.println(" grade : A");
        }
        else if(score >=80){
            System.out.println(" grade : B");
        }
        else if(score >=70){
            System.out.println(" grade : C");
        }
        else if (score >=60){
            System.out.println(" grade : D");
        }
        else {
            System.out.println(" grade : F");
        }
    }
}

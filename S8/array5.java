import java.util.Scanner;
/* take 3 subject marks from user store it in array
and calculate total and average
 */
public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[3];
        int total=0;
        double avg;

        //take marks from user
        for(int i=0; i<marks.length;i++)
        {
            System.out.println("Enter marks ");
            marks[i] = sc.nextInt();
        }

        //calculate total
        for(int i=0; i<marks.length;i++)
        {
            System.out.println("your marks  " + marks[i]);
           // total += marks[i];
            total = total + marks[i];

        }

        avg= total/3;
        System.out.println("Total of 3 subjects marks " + total);
        System.out.println("average " + avg);
    }
}

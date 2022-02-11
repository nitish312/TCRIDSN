// sum of first 10 natural numbers
public class while3 {
    public static void main(String[] args) {
        int num =1;
        int sum =0;

        while (num<=10)
        {
            sum=sum+num;
            num++;
        }
        System.out.println("sum of first 10 natural numbers "+ sum);
    }
}

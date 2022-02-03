public class prefix_postfix {
    public static void main(String[] args) {
        int num1= 5, num2= 10 ;

        /* postfix : original value of variable is returned first ,
         and then variable is incremented by 1 */

        System.out.println(num1++);
        System.out.println(num1);

        /*prefix : the value of variable is incremented by 1, then it returns the value*/

        System.out.println(++num2);
    }
}

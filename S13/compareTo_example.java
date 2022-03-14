//compareTo ()
// s1 == s2 =0
// s1 > s2 : positive value
//s1 < s2 : negative value


public class compareTo_example {
    public static void main(String[] args) {
        String s1 = "Raj";
        String s2 = "Raj";
        String s3= "Simran";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
    }
}

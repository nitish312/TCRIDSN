//equals()
//equalsIgnoreCase()

public class equals_example {
    public static void main(String[] args) {
        String s1 = "Raj" ;
        String s2 = "raj";

        String s3 = new String(("Raj"));
        String s4 = "Simran";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s4));
    }
}

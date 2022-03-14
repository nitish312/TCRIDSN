//concat() :
//string objects are unmodifiable or changeable

public class concat_example {
    public static void main(String[] args) {
        String name ="Raj";
        name.concat(" Sharma");
        System.out.println(name);

        String str = name.concat(" Sharma");
        System.out.println(str);
        System.out.println(name.concat(" Sharma"));
    }
}

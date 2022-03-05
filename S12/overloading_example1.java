//Method overloading : changing no. of parameters
class Adder
{
    static int add(int a, int b){
        return  a+ b;
    }

    static int add(int a, int b,int c){
        return  a+ b+c;
    }

}

public class overloading_example1 {

    public static void main(String[] args) {
        System.out.println(Adder.add(12,23));
        System.out.println(Adder.add(12,23,54));
    }
}

import abc.* ;

public class package_example {

    public static void main(String[] args) {
        A a1 = new A();
        a1.goodEvening();
        //not accessable because of default access modifier
        //a1.goodMorning();       //error
    }
}

//abstract class
abstract class Animal1
{
    abstract void printSound() ;
}

class Dog1 extends Animal1 {
    public void printSound(){
        System.out.println( "Dogs bark");
    }
}

class Cat1 extends Animal1 {
    public void printSound(){
        System.out.println( "Cat meow");
    }
}

public class abstract_example2 {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        Cat1 c = new Cat1();

        d.printSound();
        c.printSound();
    }
}

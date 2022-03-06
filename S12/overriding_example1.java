//method overriding
// methods in subclass and superclass must have the same name
// must have the same parameters
// must have the same return type

class Animal
{
    public void printSound(){
        System.out.println( "Sound method of parent class");
    }

}

class Dog extends Animal {
    public void printSound(){
        System.out.println( "Dogs bark");
    }
}

class Cat extends Animal {
    public void printSound(){
        System.out.println( "Cat meow");
    }
}

public class overriding_example1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.printSound();
        c.printSound();
    }
}

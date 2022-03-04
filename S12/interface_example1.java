// interface
interface Walk {
    void walk();
}

// class Dog implements interface Walk
class Dog3 implements Walk {

    public void walk() {
        System.out.println("A dog walks for 10 hours in a day");
    }
}

class interface_example1 {

    public static void main(String[] args) {
        Dog3 d = new Dog3();
        d.walk();
    }
}

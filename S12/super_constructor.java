// superclass
class Person2 {

    protected String name;

    public Person2() {
        System.out.println("Default constructor of parent class");
    }

    public Person2(String n) {
        name = n;
        System.out.println("name: " + name);
    }
}

// subclass
class Student2 extends Person2 {

    public Student2() {
        super("John"); // calls the parameterized constructor of the superclass
        System.out.println("Constructor of child class");
    }
}

class super_constructor {

    public static void main(String[] args) {
        Student2 st = new Student2();
    }
}

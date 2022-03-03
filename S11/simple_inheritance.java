// simple inheritance
//superclass
class Person{
    public void print1() {
        System.out.println("I am superclass");
    }
}

//subclass
class Student extends Person{
    public void print2() {
        System.out.println("I am subclass");
    }
}

public class simple_inheritance {
    public static void main(String[] args) {
        //creating object of superclass.
        Person p1 = new Person();
        p1.print1();

        //creating object of subclass.
        Student s1 = new Student()  ;
        s1.print1();
        s1.print2();
    }
}

class Person1
{
    String name ;           //instance variables
    int age;                //instance variables

    //constructor overloading
    Person1(){                      //default constructor

    }

    Person1(String name, int age)   //parameterized constructor
    {
        this.name = name;
        this.age=age;
    }

    public void info()              //method
    {
        System.out.println("name : " +name);
        System.out.println("age : " +age);
    }
}

class Student1 extends Person1
{
    String branch ;
    Student1(String name, int age, String branch)
    {
        super(name,age);        //accessing superclass members and methods
        this.branch= branch;
    }

    void info1(){
        System.out.println("I am student's method in branch " + branch);
    }
}

public class student_Inheritance {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Raj", 23);
        p1.info() ;

        Student1 s1 = new Student1("Amit", 25, "CS");
        s1.info();
        s1.info1();

    }
}

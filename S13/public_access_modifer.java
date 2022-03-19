//public access modifier
class Student{
    //public variable
    public String name ;

    //constructor
    public Student(String n)
    {
        name =n;
    }

    //public method
    public void printDetails()
    {
        System.out.println("This is a public method");
    }
}

public class public_access_modifer {
    public static void main(String[] args) {
        Student s1 = new Student("Raj");

        //accessing public variable
        System.out.println(s1.name);

        //accessing public method
        s1.printDetails();
    }
}
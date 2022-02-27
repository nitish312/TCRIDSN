//Multilevel inheritance
//base class
class Person {
    public void show()
    {
        System.out.println("person method ");
    }
}

class Student extends Person
{
    public void show1(){
        System.out.println("student method");
    }
}

class EngineeringStudent extends Student
{
    public void show2(){
        System.out.println("Engineering Student method");
    }
}

public class MultilevelDemo {
    public static void main(String[] args) {
        EngineeringStudent obj = new EngineeringStudent();
        obj.show();
        obj.show1();
        obj.show2();
    }
}

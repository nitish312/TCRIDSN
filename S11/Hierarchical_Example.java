//base class
class Person2
{
    String name ;
    public void person_info(){
        System.out.println("I am a Person");
    }
}

class Student2 extends Person2
{
    public void student_info(){
        System.out.println("I am a Student");
    }
}

class Teacher2 extends Person2
{
    public void teacher_info(){
        System.out.println("I am a Teacher");
    }
}

class Doctor2 extends Person2
{
    public void doctor_info(){
        System.out.println("I am a Doctor");
    }
}

public class Hierarchical_Example {
    public static void main(String[] args) {
        Teacher2 t1 = new Teacher2();
        Student2 s1 = new Student2();
        Doctor2 d1= new Doctor2();

        t1.teacher_info();
        t1.person_info();

        s1.student_info();
        s1.person_info();

        d1.doctor_info();
        d1.person_info();
    }
}

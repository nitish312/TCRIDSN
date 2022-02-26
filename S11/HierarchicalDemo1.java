//base class
class Person1 {
    String name ;
    public void show_person () {
        System.out.println("I am a Person");
    }
}

//child 1
class Student1 extends Person1
{
    public void show_student (){
        System.out.println("I am a student ");
    }
}

//child 2
class Teacher extends Person1{
    public void show_teacher(){
        System.out.println("I am a Teacher ");
    }
}

//child 3
class  Doctor extends Person1
{
    public void show_doctor ()
    {
        System.out.println("I am a Doctor ");
    }
}

public class HierarchicalDemo1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student1 student = new Student1();
        Doctor doctor = new Doctor();

        teacher.show_teacher();
        student.show_student();
        doctor.show_doctor();
    }
}
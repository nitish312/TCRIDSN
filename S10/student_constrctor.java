class Student {
   private int rollno ;
   private String name;

    Student (){          //constructor
        System.out.println("constructor created ....!!!");
        rollno=1001;
        name="Raj";
    }

    void display ()
    {
        System.out.println("rollno :" + rollno);
        System.out.println("name :" + name);
    }
}

public class student_constrctor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student();
        s2.display();
    }
}
//constructor overloading
class Students {
    private int rollno ;
    private String name;

    Students (){          //default constructor
        System.out.println("default constructor created ....!!!");
        rollno=1001;
        name="Raj";
    }

    Students (int r, String n){          //parameterized constructor
        System.out.println("parameterized constructor created ....!!!");
        rollno=r;
        name=n;
    }

    Students (String n){          //parameterized constructor
        rollno=1000;
        name=n;
    }

    void printDetails ()
    {
        System.out.println("Your name is " + name + "and your rollno is " + rollno);
    }
}

public class student_para_constructor {
    public static void main(String[] args) {
        Students s1 = new Students();       //constructor invoke
        s1.printDetails();          //method invoke

        Students s2 = new Students(1002,"Simran");
        s2.printDetails();

        Students s3 = new Students("Rajesh");
        s3.printDetails();
    }
}
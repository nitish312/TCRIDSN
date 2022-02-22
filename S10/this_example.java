//this keyword : to refer current object
class Student2
{
    int rollno ;        //instance variables
    String name ;       //instance variables

    Student2(int rollno, String name)       //constructor overloading
    {
        this.rollno=rollno ;
        this.name=name;
    }

    Student2()       //constructor overloading
    {
        this.rollno=1 ;
        this.name="default";
    }


    void display(){             //method overloading
        System.out.println(rollno + " " +  name );
    }

    void display(String name){ //method overloading
        System.out.println(name );
    }
}

public class this_example {
    public static void main(String[] args) {
        Student2 s1 = new Student2(1,"Raj");
        Student2 s2 = new Student2();

        s1.display();
        s1.display("Raj");
    }
}

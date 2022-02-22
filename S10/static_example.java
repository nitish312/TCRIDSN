class Student1
{
    int rollno ;
    String name ;
    static String college ="TCR";       //static variable

    Student1(int r, String n)
    {
        rollno=r;
        name=n;
    }

    void display(){
        System.out.println(rollno + " " +  name + " " + college );
    }
}
public class static_example {
    public static void main(String[] args) {
        Student1 s1 = new Student1(1,"Raj");
        Student1 s2 = new Student1(2,"Simran");
        System.out.println(Student1.college);
        s1.display();
        s2.display();
    }
}

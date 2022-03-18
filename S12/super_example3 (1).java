// superclass
class Person4 {

    protected String name;
    protected int age;

    public Person4(String p_name, int p_age) {
        name = p_name;
        age = p_age;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// subclass 1
class Student4 extends Person4 {

    private int marks;

    public Student4(String s_name, int s_age, int s_marks) {
        super(s_name, s_age);
        marks = s_marks;
    }

    public void display() {
        System.out.println("#### Details of student ####");
        super.display();
        System.out.println("Marks: " + marks);
    }
}

// subclass 2
class Teacher4 extends Person4 {

    private int salary;

    public Teacher4(String t_name, int t_age, int t_salary) {
        super(t_name, t_age);
        salary = t_salary;
    }

    public void display() {
        System.out.println("#### Details of teacher ####");
        super.display();
        System.out.println("Salary: " + salary);
    }
}

class super_example3 {

    public static void main(String[] args) {
        // creating object of subclass Student
        Student4 st = new Student4("John", 20, 84);
        st.display();

        // creating object of subclass Teacher
        Teacher4 tch = new Teacher4("Julie", 40, 200000);
        tch.display();
    }
}

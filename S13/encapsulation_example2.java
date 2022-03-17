//another example of encapsulation
class Student01 {
    private int roll_no;
    private String Name;
    private int age;

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class encapsulation_example2 {
    public static void main(String[] args) {
        Student01 s1= new Student01();

        s1.setAge(20);
        s1.setName("TCR");
        s1.setRoll_no(101);

        System.out.println("Age is : " +s1.getAge());
        System.out.println("Name is : "+s1.getName());
        System.out.println("Roll No is : "+s1.getRoll_no());
    }
}
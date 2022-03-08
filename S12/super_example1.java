// superclass
class Person {

    public void message() {
        System.out.println("I am a Person");
    }
}

// subclass
class Student extends Person {

    public void message() {
        System.out.println("I am a Student");
    }

    public void display() {
        super.message();
    }
}

class super_example1 {

    public static void main(String[] args) {
        Student st = new Student();
        st.display();
    }
}
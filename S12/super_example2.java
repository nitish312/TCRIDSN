// superclass
class Person1 {

    protected String name = "John";
}

// subclass
class Student1 extends Person1 {

    private String name = "Julie";

    public void display() {
        System.out.println(super.name);
    }
}

class super_example2 {
    public static void main(String[] args) {
        Student1 st = new Student1();
        st.display();
    }
}
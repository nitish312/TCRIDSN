//simple encapsulation
class Student2 {
    private String name ;     //private members

    //public method
    public void setName(String name){
        this.name=name;
    }

    //public method
    public String getName(){
        return name;
    }
}

public class encapsulation_example {
    public static void main(String[] args) {
        Student2 s1= new Student2();

        s1.setName("Raj");
        System.out.println(s1.getName());
    }
}

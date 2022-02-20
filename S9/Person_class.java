class Person{
    String name;        //fields or instance variables
    int age;

    //method
    void info(){
        System.out.println(name + " is " +age + " years old ...!!!");
    }
}

public class Person_class {
    public static void main(String[] args) {
        Person p1 = new Person();       //to create object of class
        p1.name="Raj";                  //assign value of member
        p1.age = 22;
        p1.info();                      //invoke method of object or calling method

        Person p2 = new Person();
        p2.name="Simran";
        p2.age=20;
        p2.info();
    }
}
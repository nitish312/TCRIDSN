//method overriding
//creating a parent class

class Vehicle
{
    //defining a method
    void run(){
        System.out.println("Vehicle is running");
    }
}

//Creating a child class
class Bike extends Vehicle
{
    void run(){            // method overriding
        System.out.println("bike is running");
    }
}

public class overriding_example2 {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.run();         // calling method
    }
}
/* A Real Life Example of Interface

        We know that all vehicles (including cars and bikes) need servicing from time to time. Suppose we want to create two classes named Car and Bike having a method that returns the time after which servicing is required for the vehicle. Here, we can create an interface named Servicing having an abstract method named getServiceTime() and can make the classes Car and Bike implement the interface Servicing and thus implement its method getServiceTime().

        Note that when a class implements an interface, it must implement all the methods of the interface. Therefore, in our example, the interface Servicing acts as a base or a prototype for both theclasses. Thus, all the classes implementing the Servicing interface must define the getServiceTime() method.
 */
// interface
interface Servicing {
    // abstract method
    int getServiceTime();
}

// class implements interface
class Car1 implements Servicing {

    //implementing abstract method
    public int getServiceTime() {
        return 2;
    }
}

// class implements interface
class Bike1 implements Servicing {

    //implementing abstract method
    public int getServiceTime() {
        return 3;
    }
}

class interface_example2 {

    public static void main(String[] args) {
        Car1 c = new Car1();
        Bike1 b = new Bike1();

        System.out.println(c.getServiceTime());
        System.out.println(b.getServiceTime());
    }
}

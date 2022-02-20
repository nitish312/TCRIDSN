package Exercises;
// Q3
public class Car 
{
    int year;
    String make;
    double speed;
    Car(int year, String make, double speed)
    {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }
    int getYear()
    {
       return year; 
    }
    String getMake()
    {
       return make; 
    }
    double getSpeed()
    {
       return speed; 
    }
    public static void main(String[] args) 
    {
        Car c = new Car(2022, "Land Rover",200.0);
        System.out.println("Year = "+c.getYear());
        System.out.println("Make = "+c.getMake());
        System.out.println("Speed = "+c.getSpeed());
    }
}
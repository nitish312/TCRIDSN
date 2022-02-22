class Employee {
    int empno ;
    String name ;
    static int counter =0;

    Employee()          //constructor
    {
        counter+=1;
    }
    static void info()
    {

    }
}

public class static_counter {
    public static void main(String[] args) {
        Employee e1 = new Employee() ;
        Employee e2 = new Employee() ;
        Employee e3 = new Employee() ;
        Employee e4 = new Employee() ;
        System.out.println("Total no. of objects = " +Employee.counter);
    }
}

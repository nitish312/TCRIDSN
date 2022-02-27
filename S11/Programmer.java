// single inheritance
class Employee {
    int empid;
    float salary = 40000;

    Employee (){
    }

    Employee(int id, float s)
    {
        empid = id;
        salary= s ;
    }

    void details (){
        System.out.println("empid : " + empid);
        System.out.println("salary : " + salary) ;
    }
}

public class Programmer extends Employee {
    int bonus = 10000 ;

    public static void main(String[] args) {
        Employee e = new Employee(1,30000) ;
        e.details();

        Programmer p1 = new Programmer();
        p1.details();
        System.out.println("programmer bonus " + p1.bonus);
    }
}
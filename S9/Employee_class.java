import java.util.Scanner;
/*create class name as Employee
 create method input() to take input for employee
 create another method dispinfo() to display employee details.
 */
class Employee{
    String name;
    int salary;

    void input(String n, int s) {
        name = n;
        salary = s;
    }

    void dispinfo(){
        System.out.println("Employee name is:"+ name);
        System.out.println("Employee salary are:"+ salary);
    }
}
public class Employee_class {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter Employee salary");
        int sal = sc.nextInt();

        Employee e1=new Employee();
        e1.input("sagar",sal);
        e1.dispinfo();

        Employee e2=new Employee();
        e2.input("Sachin",45000);
        e2.dispinfo();
    }
}
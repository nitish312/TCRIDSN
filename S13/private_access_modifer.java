//private access modifier
class Student1
{
    private String name ;

    private void msg (){
        System.out.println("private method " );
    }
}

public class private_access_modifer {
    public static void main(String[] args) {
        Student1 s1 = new Student1();

        //accessing private variable
        //s1.name = "Raj" ;           //error

        //accessing private method
        //s1.msg() ;                  //error
    }
}

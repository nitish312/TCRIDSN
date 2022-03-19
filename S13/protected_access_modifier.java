//protected access modifier
class xyz
{
    protected void msg (){
        System.out.println("protected method");
    }
}

public class protected_access_modifier extends xyz {
    public static void main(String[] args) {
        protected_access_modifier obj = new protected_access_modifier() ;
        obj.msg();
    }
}
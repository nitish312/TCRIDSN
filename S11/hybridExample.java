class test3
{
    public void display(){
        System.out.println("class test 3");
    }
}

class test1 extends test3
{
    public void display()
    {
        System.out.println("test1 class");
    }
}

class test2 extends test3
{
    public void display()
    {
        System.out.println("test2 class");
    }
}

public class hybridExample extends test1 {
    public void display()
    {
        System.out.println("hybridExample class");
    }
    public static void main(String[] args) {
        hybridExample obj = new hybridExample();
        obj.display();
    }
}

//multilevel inheritance
class Electronics {
    public Electronics(){
        System.out.println("Electronics class");
    }
    public void deviceType()
    {
        System.out.println("Device Type: Electronics");
    }
}

class Television extends Electronics
{
    public Television(){
        System.out.println("Television class");
    }
    public void category()
    {
        System.out.println("category Type: Television");
    }
}

class LED extends Television
{
    public LED()
    {
        System.out.println("LED class");
    }
    public void display_tech()
    {
        System.out.println("dispaly Type: :LED");
    }
}

public class multileveldemo {
    public static void main(String[] args) {
        LED led1 = new LED();
        led1.deviceType();
        led1.category();
        led1.display_tech();
    }
}

class Bank
{
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank
{
    float getRateOfInterest(){
        return 8.5f;
    }
}

class ICIC extends Bank
{
    float getRateOfInterest(){
        return 7.5f;
    }
}

class AXIS extends Bank
{
    float getRateOfInterest(){
        return 9.5f;
    }
}

public class testPolymorphism1 {
    public static void main(String[] args) {
        Bank  bank;
        bank = new SBI();           //ref SBI
        System.out.println("SBI Bank rate of Interest :"+ bank.getRateOfInterest());

        bank = new ICIC();          //ref ICICI
        System.out.println("ICIC Bank rate of Interest :"+ bank.getRateOfInterest());

        bank = new AXIS();          //ref AXIS
        System.out.println("AXIS Bank rate of Interest :"+ bank.getRateOfInterest());
    }
}
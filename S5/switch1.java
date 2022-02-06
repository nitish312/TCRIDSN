public class switch1 {
    public static void main(String[] args) {
        int num=50;

        switch (num)
        {
            case 1:
                System.out.println("you choose one option");
                break;
            case 2:
                System.out.println("you choose two option");
                break;
            case 3:
                System.out.println("you choose three option");
                break;
            case 4:
                System.out.println("you choose four option");
                break;
            default:
                System.out.println("number is not between 1 to 4");
        }
    }
}
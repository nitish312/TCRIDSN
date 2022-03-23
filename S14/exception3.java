//specific exception
public class exception3 {
    public static void main(String[] args) {
        int arr[] = new int[10];

        try {
          arr[12]= 50;
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("exception " + ex);
        }
    }
}


//for each loop
public class array8 {
    public static void main(String[] args) {
        int [] marks = {45,887,65,82,37};
        String [] friends = {"Rajesh", "Naresh", "Suresh", "Ramesh"};

        //for loop with int
        for(int i = 0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        //iterating over an int array
        for( int i : marks)
        {
            System.out.println(i);
        }

        //for loop with string
        for(int i = 0;i<friends.length;i++)
        {
            System.out.println(friends[i]);
        }

        //iterating over an string array
        for( String var : friends)
        {
            System.out.println(var);
        }
    }
}

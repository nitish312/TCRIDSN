public class array3 {
    public static void main(String[] args) {
        //2nd way to create array
        int [] marks = {45,87,65,82,37};

        //iterating through for loop
//        for(int i=0; i<5;i++){
//            System.out.println(marks[i]);
//        }

        //iterating through while loop
        int x=0;
        while(x<5)
        {
            System.out.println(marks[x]);
            x+=1;
        }

    }
}

// calculate the sum of all elements of an array

public class array4 {
    public static void main(String[] args) {
        int [] marks = {45,87,65,82,37,45,67};
        int sum=0;

        System.out.println("Size of marks array " + marks.length);

        for(int i=0; i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println("sum of array elements = "+ sum);
    }
}

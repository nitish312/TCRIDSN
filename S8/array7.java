public class array7 {
    public static void main(String[] args) {
        int [][] marks = { {1,2,3} ,{40,50,76}, {85,65,74} } ;

        for (int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print(marks[r][c] + " ");
            }
            System.out.println();
        }
    }
}
/*

r       c
0       0               1
0       1               2
0       2               3

1       0               40
1       1               50
1       2               76

2       0               85
2       1               65
2       2               74
 */
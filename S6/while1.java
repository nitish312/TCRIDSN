//simple while loop

public class while1 {
    public static void main(String[] args) {
        int num=1;
        while(num<=10)
        {
            System.out.println(num);
            num++;
        }
    }
}

/*
num         num <=10    true/false     print num       num++
1           1 <=10      true            1               2
2           2<=10       true            2               3
3
4
5
6
7
8
9                                                       10
10          10<=10      true             10             11
11          11 <=10     false   end of loop
*/


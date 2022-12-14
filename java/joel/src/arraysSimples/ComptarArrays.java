package arraysSimples;

import java.util.Scanner;

public class ComptarArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int times2;
        int match = 0;
        int nums;
        for (int i = 0; i < times; i++) {
            times2 = sc.nextInt();
            int [] num = new int [times2];
            for (int j = 0; j < times2; j++) {
                num [j] = sc.nextInt();
            }
            nums = sc.nextInt();
            for (int ii = 0; ii < times2; ii++) {
                if (num [ii] == nums) match ++;
            }
            System.out.println(match);
            match = 0;
        }
        sc.close();
    } 
}

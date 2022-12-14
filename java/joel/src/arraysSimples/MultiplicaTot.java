package arraysSimples;

import java.util.Scanner;

public class MultiplicaTot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int times2;
        int multi;
        for (int i = 0; i < times; i++) {
            times2 = sc.nextInt();
            int [] num = new int [times2];
            for (int j = 0; j < times2; j++) {
                num [j] = sc.nextInt();
            }
            multi = sc.nextInt();
            for (int l = 0; l < times2; l++) {
                System.out.print(num[l] * multi + " ");
            }
            System.out.println();
        }
        sc.close();
    } 
}

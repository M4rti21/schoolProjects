package arraysSimples;

import java.util.Scanner;

public class Recordes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int times2;
        int where;
        for (int i = 0; i < times; i++) {
            times2 = sc.nextInt();
            int [] num = new int [times2];
            for (int j = 0; j < times2; j++) {
                num [j] = sc.nextInt();
            }
            where = sc.nextInt();
            System.out.println(num[where]);
        }
        sc.close();
    } 
}

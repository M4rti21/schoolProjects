package arraysSimples;

import java.util.Scanner;

public class EleccionsPatates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int times2;
        int win = 0;
        for (int i = 0; i < times; i++) {
            times2 = sc.nextInt();
            int [] num = new int [(times2)+1];
            num [0] = -1;
            for (int j = 1; j <= times2; j++) {
                num [j] = sc.nextInt();
                if (num[j] > num[j-1]) win = j;
            }
            System.out.println(win);
            win = 0;
        }
        sc.close();
    } 
}

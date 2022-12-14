package arraysSimples;

import java.util.Scanner;

public class IndexDe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int times2;
        int index;
        int where = -1;
        for (int i = 0; i < times; i++) {
            times2 = sc.nextInt();
            int [] num = new int [times2];
            for (int j = 0; j < times2; j++) {
                num [j] = sc.nextInt();
            }
            index = sc.nextInt();
            for (int l = times2-1; l > -1; l--) {
                if (num [l] == index) where = l;
            }
            System.out.println(where);
            where = -1;
        }
        sc.close();
    } 
}

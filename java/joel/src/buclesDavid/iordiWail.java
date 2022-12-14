package buclesDavid;

import java.util.Scanner;

public class iordiWail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vid;
        int strikes = 0;
        int views = 0;
        while (strikes < 3) {
            vid = sc.nextInt();
            if (vid != -1) {
                views+= vid;
            } else strikes++;
        }
        System.out.println(views);
        sc.close();
    }
}

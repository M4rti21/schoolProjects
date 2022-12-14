package arraysSimples;

import java.util.Scanner;

public class Parxis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int pos;
        for (int i = 0; i < times; i++) {
            pos = sc.nextInt();
            int a;
            int b;
            int num;
            for (int j = 0; j < 3; j++) {
                num = sc.nextInt();
                if (pos == 8) {
                } else if ((pos + num) > 8) {
                    a = pos+num;
                    b = a-8;
                    pos = 8-b;
                } else {
                    pos += num;
                }
            }
            System.out.println(pos);
        }
        sc.close();
    }
}

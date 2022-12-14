package matrius;

import java.util.Scanner;

public class simetries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x,y;
        boolean v = true;
        boolean h = true;
        for (int i = 0; i < t; i++) {
            v = true;
            h = true;
            x = sc.nextInt();
            y = sc.nextInt();
            char[][] a = new char[x][y];
            for (int j = 0; j < a.length; j++) {
                for (int l = 0; l < a[0].length; l++) {
                    a[j][l] = sc .next().charAt(0);
                }
            }
            for (int j = 0; j < a.length; j++) {
                for (int l = 0; l < a[0].length; l++) {
                    if (a[j][l] != a[a.length-1-j][l]) {
                        h = false;
                    }
                    if (a[j][l] != a[j][a[0].length-1-l]) {
                        v = false;
                    }
                }
            }
            if (h && v) {
                System.out.println("DOBLE");
            } else if (h) {
                System.out.println("HORIZONTAL");
            } else if (v) {
                System.out.println("VERTICAL");
            } else System.out.println("CAP");
        }
        sc.close();
    }
}
package arraysSimples;

import java.util.Scanner;

public class cuaritmetic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] x = new int[3][3];
        boolean good = true;
        int a,d;
        int a1,a2,a3;
        
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < x.length; i++) {
            a1 = x[i][0];
            a2 = x[i][1];
            a3 = x[i][2];
            if (a1 != a2 - (a3 - a2)) {
                good = false;
            }
            if (a2 != ((a3 - a1) / 2) + a1) {
                good = false;
            }
            if (a3 != a1 + (2 * (a2 - a1))) {
                good = false;
            }
        }
        for (int i = 0; i < x[0].length; i++) {
            a1 = x[0][i];
            a2 = x[1][i];
            a3 = x[2][i];
            if (a1 != a2 - (a3 - a2)) {
                good = false;
            }
            if (a2 != ((a3 - a1) / 2) + a1) {
                good = false;
            }
            if (a3 != a1 + (2 * (a2 - a1))) {
                good = false;
            }
        }
        if (good) System.out.println("si");
        else System.out.println("no");
        
        //a, a+d, a+2d
        sc.close();
    }
}

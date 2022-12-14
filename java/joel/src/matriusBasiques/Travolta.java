package matriusBasiques;

import java.util.Scanner;

public class Travolta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = sc.nextInt();
        int t = sc.nextInt();
        boolean trobat = false;
        int[][] marcat = new int[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                marcat[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i < f-2; i++) {
            for (int j = 1; j < c-2; j++) {
                if (marcat[i][j-1] == t && marcat[i][j+1] == t) {
                    System.out.println(marcat[i][j]);
                    trobat = true;
                }
            }
        }
        if (! trobat) System.out.println("NO");
        sc.close();
    }
}
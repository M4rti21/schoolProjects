package matriusBasiques;

import java.util.Scanner;

public class Spiderman2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = sc.nextInt();
        String[][] marcat = new String[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                marcat[i][j] = sc.next();
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (i != 0 && marcat[i][j].equals("SPIDERMAN") && i != f - 1) {
                    System.out.println(marcat[i - 1][j]);
                    System.out.println(marcat[i + 1][j]);
                } else if (i == 0 && marcat[i][j].equals("SPIDERMAN")) {
                    System.out.println("NO");
                    System.out.println(marcat[i + 1][j]);
                } else if (i == f - 1 && marcat[i][j].equals("SPIDERMAN")) {
                    System.out.println(marcat[i - 1][j]);
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }
}
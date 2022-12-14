package matriusBasiques;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = sc.nextInt();
        int f1 = sc.nextInt();
        int c1 = sc.nextInt();
        int f2 = sc.nextInt();
        int c2 = sc.nextInt();
        char[][] marcat = new char[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if (i >= f1 && i <= f2 && j >= c1 && j <= c2) {
                    marcat[i][j] = 'X';
                } else {
                    marcat[i][j] = '.';
                }
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(marcat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
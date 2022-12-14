package matrius;

import java.util.Scanner;

public class ajedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = sc.nextInt();
        char[][] taula = new char[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                if(i%2 == 0) {
                    if (j%2 == 0) {
                        taula[i][j] = '.';
                    } else {
                        taula[i][j] = '#';
                    }
                } else {
                    if (j%2 == 0) {
                        taula[i][j] = '#';
                    } else {
                        taula[i][j] = '.';
                    }
                }
            }
        }
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(taula[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
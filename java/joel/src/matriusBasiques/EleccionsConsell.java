package matriusBasiques;

import java.util.Scanner;

public class EleccionsConsell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char[][] marcat = new char[a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || j == 0 || i == a-1 || j == a-1 || i - j == 0 || j + i == a-1) {
                    marcat[i][j] = 'X';
                } else {
                    marcat[i][j] = '.';
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(marcat[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
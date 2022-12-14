package matriusBasiques;

import java.util.Scanner;

public class MatriuIdentita {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] normal = new int[a][b];
        int[][] transp = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                normal[i][j] = sc.nextInt();
                transp[j][i] = normal[i][j];
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(transp[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
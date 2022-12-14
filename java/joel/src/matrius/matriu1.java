package matrius;

import java.util.Scanner;

public class matriu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = sc.nextInt();
        int [][] matrix = new int[f][c];
        for (int fil = 0; fil < f; fil++) {
            for (int col = 0; col < c; col++) {
                matrix[fil][col] = sc.nextInt();
            }
        }
        int i = sc.nextInt();
        int j = sc.nextInt();
        
        for (int fil = 0; fil < f; fil++) {
            for (int col = 0; col < c; col++) {
                System.out.print(matrix[fil][col] + " ");
            }
            System.out.println();
        }
        System.out.println(matrix[i][j]);
        sc.close();
    }
}
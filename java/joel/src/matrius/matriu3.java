package matrius;

import java.util.Scanner;

public class matriu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De quin tamany vols la matriu?");
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean nodiff = true;
        int diffs = 0;
        int[][] matrix1 = new int[x][y];
        int[][] matrix2 = new int[x][y];
        System.out.println("Omple la matriu 1");
        fillMatrix(matrix1, sc);
        System.out.println("Omple la matriu 2");
        fillMatrix(matrix2, sc);
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    if (nodiff) {
                        System.out.println("Les differencies trobades son:");
                        nodiff = false;
                    }
                    System.out.println("[" + i + "," + j + "]");
                    diffs++;
                }
            }
        }
        if (nodiff) {
            System.out.println("Cap differencia trobada");
        } else System.out.println("Hi ha " + diffs + " differencies!");
        sc.close();
    }

    public static void fillMatrix(int[][] mat, Scanner sc) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
}
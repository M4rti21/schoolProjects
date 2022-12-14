package matrius;

import java.util.Scanner;

public class oftalmoleg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][][][] matrix = new int[x][x][x][x];
        fill4DMatrix(matrix, sc);
        print4DMatrix(matrix);
        sc.close();
    }

    public static void fill4DMatrix(int[][][][] mat, Scanner sc) {
        for (int k = 0; k < mat.length; k++) {
            for (int i = 0; i < mat[0].length; i++) {
                for (int j = 0; j < mat[0][0].length; j++) {
                    for (int l = 0; l < mat[0][0][0].length; l++) {
                        mat[k][i][j][l] = l;
                    }
                }
            }
        }
    }

    public static void print4DMatrix(int[][][][] mat) {
        for (int k = 0; k < mat.length; k++) {
            for (int i = 0; i < mat[0].length; i++) {
                for (int j = 0; j < mat[0][0].length; j++) {
                    for (int l = 0; l < mat[0][0][0].length; l++) {
                        System.out.print(mat[k][i][l][j]);
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

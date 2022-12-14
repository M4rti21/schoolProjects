package examenMatrius;

import java.util.Random;
import java.lang.Math;

public class MatriuAleatoria2 {

    public static void main(String[] args) {
        Random r = new Random();
        int size = 4;
        int[][] randMatrix = new int[size][size];
        for (int i = 0; i < randMatrix.length; i++) {
            for (int j = 0; j < randMatrix[0].length; j++) {
                randMatrix[i][j] = r.nextInt(0, size);
            }
        }
        int xRand = r.nextInt(0,size);
        int yRand = r.nextInt(0,size);
        System.out.println(xRand + " " + yRand);
        int sumaC = 0;
        int sumaD = 0;
        for (int v = 0; v < randMatrix.length; v++) {
            for (int h = 0; h < randMatrix[0].length; h++) {
                if (h == xRand || v == yRand) {
                    sumaC += randMatrix[v][h];
                }
                if (Math.abs(xRand - h) == Math.abs(yRand - v)) {
                    sumaD += randMatrix[v][h];
                }
            }
        }
        FunctionsClass.print_Matrix(randMatrix);
        System.out.println(sumaC);
        System.out.println(sumaD);
    }
}
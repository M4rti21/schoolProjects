package examenMatrius;

import java.util.Random;

public class MatriuAleatoria {

    public static void main(String[] args) {
        Random r = new Random();
        int size = 20;
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
                if (((h < xRand && v < yRand) && (xRand - h == yRand - v)) || //top-Left
                    ((h > xRand && v < yRand) && (xRand - h == v - yRand)) || //top-Right
                    ((h < xRand && v > yRand) && (h - xRand == yRand - v)) || //bottom-Left
                    ((h > xRand && v > yRand) && (h - xRand == v - yRand)) || //bottom-Right
                    (h == xRand && v == yRand)) {
                    sumaD += randMatrix[v][h];
                }
            }
        }
        System.out.println(sumaC);
        System.out.println(sumaD);
        FunctionsClass.print_Matrix(randMatrix);
    }
}
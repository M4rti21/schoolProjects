package matrius;

import java.util.Scanner;

public class aeiou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        char[][][] matrix = new char[txt.length()][5][5];
        textToMatrix(matrix, txt);
        print3DMatrix(matrix);
        sc.close();
    }

    public static void textToMatrix(char[][][] mat, String text) {
        char ok = 'ඞ';
        char no = ' ';
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                for (int l = 0; l < mat[0][0].length; l++) {
                    switch (text.toUpperCase().charAt(i)) {
                        case 'A':
                            if (j == 0 || l == 0 || l == 4 || j == 2) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'B':
                            if (j == 0 ||
                                    l == 0 ||
                                    l == 4 ||
                                    j == 2 ||
                                    j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'C':
                            if (j == 0 ||
                                    l == 0 ||
                                    j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'D':
                            if (j == 0 ||
                                    l == 0 ||
                                    l == 4 ||
                                    j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'E':
                            if (j == 0 ||
                                    l == 0 ||
                                    j == 2 ||
                                    j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'F':
                            if (j == 0 ||
                                    l == 0 ||
                                    j == 2) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'G':
                            if ((j == 0 ||
                                    l == 0 ||
                                    j == 2 ||
                                    j == 4 ||
                                    (l == 4 &&
                                            (j == 4 ||
                                                    j == 3 ||
                                                    j == 2)))) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'H':
                            if (l == 0 ||
                                    l == 4 ||
                                    j == 2) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'I':
                            if (l == 2 ||
                                    j == 0 ||
                                    j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'J':
                            if (l == 4 ||
                                    j == 4 ||
                                    (j == 3 &&
                                            l == 0)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'K':
                            if (l == 0 ||
                                    (j == 1 &&
                                            l == 1)
                                    ||
                                    (j == 1 &&
                                            l == 2)
                                    ||
                                    (j == 0 &&
                                            l == 3)
                                    ||
                                    (j == 0 &&
                                            l == 4)
                                    ||
                                    (j == 4 &&
                                            l == 4)
                                    ||
                                    (j == 4 &&
                                            l == 3)
                                    || (j == 3 && l == 2) || (j == 3 && l == 1)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'L':
                            if (l == 0 || j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'M':
                            if (l == 0 || l == 4 || (l == 1 && j == 1) || (l == 2 && j == 2) || (l == 3 && j == 1)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'N':
                            if (l == 0 || l == 4 || (l == 1 && j == 1) || (l == 2 && j == 2) || (l == 3 && j == 3)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'O':
                            if (j == 0 || l == 0 || l == 4 || j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'P':
                            if (j == 0 || l == 0 || j == 2 || (l == 4 && j == 1)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'Q':
                            if (j == 0 || l == 0 || l == 4 || j == 4 || (j == 3 && l == 2)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'R':
                            if (l == 0 || j == 2 || (j == 1 && l == 4) || (j == 4 && l == 4) || (j == 4 && l == 3)
                                    || (j == 3 && l == 2) || (j == 3 && l == 1) || j == 0) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'S':
                            if (j == 0 || j == 2 || j == 4 || (j == 1 && l == 0) || (j == 3 && l == 4)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'T':
                            if (l == 2 || j == 0) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'U':
                            if (l == 0 || l == 4 || j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'V':
                            if ((j == 0 && l == 0) || (j == 1 && l == 0) || (j == 2 && l == 1) || (j == 3 && l == 1)
                                    || (j == 4 && l == 2) || (j == 0 && l == 4) || (j == 1 && l == 4)
                                    || (j == 2 && l == 3) || (j == 3 && l == 3)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'W':
                            if (l == 0 || l == 4 || j == 4 || l == 2) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'X':
                            if (l == j || l + j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'Y':
                            if ((l == 1 && j == 3) || (l == 4 && j == 0) || (l == 0 && j == 4) || (l == 0 && j == 0)
                                    || (l == 1 && j == 1) || (l == 2 && j == 2) || (l == 3 && j == 1)) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case 'Z':
                            if (j == 0 || j == 4 || l + j == 4) {
                                mat[i][j][l] = ok;
                            } else {
                                mat[i][j][l] = no;
                            }
                            break;
                        case ' ':
                            mat[i][j][l] = no;
                            break;
                        default:
                            mat[i][j][l] = '?';
                            break;
                    }
                }
            }
        }
    }

    public static void print3DMatrix(char[][][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                for (int l = 0; l < mat[0][0].length; l++) {
                    System.out.print(mat[i][j][l]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}

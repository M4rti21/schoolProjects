package matrius;

import java.util.Scanner;

public class oftalmoleg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String o = sc.nextLine();
        int cont = 1;
        int siz = 2;
        int [][] matrix = new int[siz][siz];
        int [][] copia = new int[siz][siz];
        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[0].length; j++) {
                matrix[i][j] = cont;
                cont++;
            }
        }
        for (int l = 0; l < o.length(); l++) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    switch (o.toUpperCase().charAt(l)) {
                        case 'V':
                            copia[i][j] = matrix[i][matrix[0].length-1-j];
                            break;
                        case 'H':
                            copia[i][j] = matrix[matrix.length-1-i][j];
                            break;
                    }
                }
            }
            for (int i = 0; i < copia.length; i++) {
                for (int j = 0; j < copia[0].length; j++) {
                    matrix[i][j] = copia[i][j];
                }
            }
        }
        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

package matrius;

import java.util.Scanner;

public class matriu4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("De quin tamany vols la matriu?");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Omple una matriu de "+ x + "x" + y + " que son " + (x*y) + " caracters");
        char[][] matrix = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        System.out.println("Quin caracter vols buscar?");
        char se = sc.next().charAt(0);
        System.out.println("Per a quin caracter el vols cambiar?");
        char su = sc.next().charAt(0);

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (matrix[i][j] == se) {
                    matrix[i][j] = su;
                }
            }
        }
        System.out.println("Aqui tens el resultat:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
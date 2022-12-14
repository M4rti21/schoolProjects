package matriusBasiques;

import java.util.Scanner;

public class BlackFriday {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] productes = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                productes[i][j] = sc.nextInt();
            }
        }
        int c = sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                productes[i][j] *= c;
                System.out.print(productes[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
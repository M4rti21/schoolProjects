package buclesDavid;

import java.util.Scanner;

public class descomprimir {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a;
        char b;
        for (int i = 0; i < t; i++) {
            a = sc.nextInt();
            b = sc.next().charAt(0);
            for (int j = 0; j < a; j++) {
                System.out.print(b);
            }
            System.out.println();
        }
        sc.close();
    }

}

package arrayLists;

import java.util.Scanner;

public class PremiInesperat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char [][] t = new char[a][b];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                if (j%2 == 0 && i%2 == 0) {
                    t[i][j] = '.';
                } else {
                    t[i][j] = '#';
                }
                System.out.print(t[i][j]+ " ");
            }
            System.out.println();
            
        }
        sc.close();
    }
}
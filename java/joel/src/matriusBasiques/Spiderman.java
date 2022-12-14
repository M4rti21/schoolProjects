package matriusBasiques;

import java.util.Scanner;

public class Spiderman {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int c = sc.nextInt();
        boolean no = true;
        String[][] marcat = new String[f][c];
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                marcat[i][j] = sc.next();
                if (i != 0 && marcat[i][j].equals("SPIDERMAN")) {
                    System.out.println(marcat[i-1][j]);
                    no = false;
                }
            }
            
        }
        if (no) System.out.println("NO");
        sc.close();
    }
}
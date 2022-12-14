package arraysSimples;

import java.util.Scanner;

public class zebrabeatles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] c = new int [sc.nextInt()][sc.nextInt()];
        int s = sc.nextInt();
        int cnt = -1;
        for (int i = 0; i < c.length; i++) {
            if (i >= s) {
                cnt++;
            }
            for (int j = 0; j < c[0].length; j++) {
                if (i >= s && cnt%2 == 0 && cnt!=-1) {
                    c[i][j] = 1;
                }
                else {
                    c[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    } 
}

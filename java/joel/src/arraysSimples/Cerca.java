package arraysSimples;

import java.util.Scanner;

public class Cerca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        int m;
        boolean good = false;
        
        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            int [] num = new int [k];
            for (int l = 0; l < k; l++) {
                num[l] = sc.nextInt();
            }
            m = sc.nextInt();
            for (int j = 0; j < k; j++) {
                if (num[j] >= (m-1) && num[j] <= (m+1)) {
                    good = true;
                }
            }
            if (good) System.out.println("SI");
            else System.out.println("NO");
            good = false;
        }
        sc.close();
    }
}

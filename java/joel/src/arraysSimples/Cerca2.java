package arraysSimples;

import java.util.Scanner;

public class Cerca2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        int m;
        int a;
        int good = 0;
        
        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            int [] num = new int [k];
            for (int l = 0; l < k; l++) {
                num[l] = sc.nextInt();
            }
            m = sc.nextInt();
            a = sc.nextInt();
            for (int j = 0; j < k; j++) {
                if (num[j] >= (m-a) && num[j] <= (m+a)) {
                    good ++;
                }
            }
            System.out.println(good);
            good = 0;
        }
        sc.close();
    }
}

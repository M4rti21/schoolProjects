package arraysSimples;

import java.util.Scanner;

public class Bloodborne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        boolean good = false;
        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            int [] arr = new int [k];
            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextInt();
            }
            for (int l = 1; l < k; l++) {
                if (arr[l] == arr[l-1]) good = true;
            }
            if (good) System.out.println("SI");
            else System.out.println("NO");
            good = false;
        }
        sc.close();
    } 
}

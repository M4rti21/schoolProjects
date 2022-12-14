package arraysSimples;

import java.util.Scanner;

public class Animals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k;
        boolean good = false;
        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            sc.nextLine();
            String [] arr = new String [k];
            for (int j = 0; j < k; j++) {
                arr[j] = sc.nextLine();
            }
            for (int l = 0; l < k-1; l++) {
                if (arr[l].equals(arr[arr.length-1])) good = true;
            }
            if (good) System.out.println("SI");
            else System.out.println("NO");
            good = false;
        }
        sc.close();
    } 
}

package arraysSimples;

import java.util.Scanner;

public class Macarrisme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double [] arr = new double [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        for (int j = 0; j < n; j++) {
            arr[j] = arr[j]*100;
            System.out.print(arr[j] + "% ");
        }
        sc.close();
    } 
}

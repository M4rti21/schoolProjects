package arraysSimples;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int [] num = new int [times];
        for (int i = 0; i < times; i++) {
            num [i] = sc.nextInt();
        }
        for (int j = 0; j < times; j++) {
            System.out.print(num [j] + " ");
        }
        System.out.println("");
        int pos = sc.nextInt();
        System.out.println(num[pos]);
        sc.close();
    } 
}

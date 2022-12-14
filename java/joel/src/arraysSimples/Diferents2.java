package arraysSimples;

import java.util.Scanner;

public class Diferents2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        boolean good = true;
        int a;
        for (int i = 0; i < times; i++) {
            a = sc.nextInt();
            int [] num = new int [a];
            int [] num2 = new int [a];
            for (int j = 0; j < a; j++) {
                num[j] = sc.nextInt();
            }
            for (int j = 0; j < a; j++) {
                num2[j] = sc.nextInt();
            }
            for (int j = 0; j < a; j++) {
                for (int j2 = 0; j2 < a; j2++) {
                    if (num[j] == num2[j2]) good = false;
                }
            }
            if (good) System.out.println("SI");
            else System.out.println("NO");
            good = true;
        }
        sc.close();
    } 
}

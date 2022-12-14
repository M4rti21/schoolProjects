package arraysSimples;

import java.util.Scanner;

public class Dretaa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int [] num = new int [times];
        for (int i = 0; i < times; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print(num[num.length-1] + " ");
        for (int ii = 0; ii < times-1; ii++) {
            System.out.print(num[ii] + " ");
        }
        sc.close();
    } 
}

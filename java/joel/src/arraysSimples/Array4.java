package arraysSimples;

import java.util.Scanner;

public class Array4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        int [] num = new int [times];
        for (int i = 0; i < times; i++) {
            num [i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        for (int ii = 0; ii < times; ii++) {
            num [ii] += sum;
            System.out.print((num [ii] + " "));
        }
        sc.close();
    } 
}

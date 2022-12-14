package arraysSimples;

import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        String [] num = new String [times];
        for (int i = 0; i < times; i++) {
            num [i] = sc.nextLine();
            System.out.println(num [i]);
        }
        int where = sc.nextInt();
        System.out.println(num[where]);
        sc.close();
    } 
}

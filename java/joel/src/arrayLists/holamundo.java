package arrayLists;

import java.util.Scanner;

public class holamundo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMERO 1: ");
        int a = sc.nextInt();
        System.out.print("NUMERO 2: ");
        int b = sc.nextInt();
        System.out.println(a+b);
        sc.close();
    }
}
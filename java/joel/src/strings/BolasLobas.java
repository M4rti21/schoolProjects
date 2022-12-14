package strings;

import java.util.Scanner;

public class BolasLobas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        int p1;
        int p2;
        for (int i = 0; i < times; i++) {
            StringBuilder str = new StringBuilder(sc.nextLine());
            p1 = sc.nextInt();
            p2 = sc.nextInt();
            sc.nextLine();
            str.insert(p1, str.charAt(p2));
            str.insert(p2+1, str.charAt(p1+1));
            str.deleteCharAt(p1+1);
            str.deleteCharAt(p2+1);
            System.out.println(str);
        }
        sc.close();
    }
}
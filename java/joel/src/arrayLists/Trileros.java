package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Trileros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n1, n2;
        ArrayList<Integer> gots = new ArrayList<Integer>();
        gots.add(1);
        for (int i = 0; i < size-1; i++) {
            gots.add(0);
        }
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        while (n1 != -1 && n2 != -1) {
            Collections.swap(gots, n1, n2);
            n1 = sc.nextInt();
            n2 = sc.nextInt();
        }
        System.out.println(gots);
        System.out.println(gots.indexOf(1));
        sc.close();
    }
}
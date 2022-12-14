package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Repetits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int elms;
        int a;
        boolean repe = false;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < times; i++) {
            elms = sc.nextInt();
            for (int j = 0; j < elms; j++) {
                a = sc.nextInt();
                if (nums.contains(a)) {
                    repe = true;
                }
                nums.add(a);
            }
            if (repe) System.out.println("SI");
            else System.out.println("NO");
            repe = false;
            nums.clear();
        }
        sc.close();
    }
}
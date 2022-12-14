package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Frequencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int elms;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < times; i++) {
            elms = sc.nextInt();
            for (int j = 0; j < elms; j++) {
                nums.add(sc.nextInt());
            }
            for (int j = 0; j < 10; j++) {
                System.out.print(Collections.frequency(nums, j) + " ");
            }
            System.out.println();
            nums.clear();
        }
        sc.close();
    }
}
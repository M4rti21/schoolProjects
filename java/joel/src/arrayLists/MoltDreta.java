package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MoltDreta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int elms;
        int d;
        int a;
        int last;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < times; i++) {
            elms = sc.nextInt();
            for (int j = 0; j < elms; j++) {
                nums.add(sc.nextInt());
            }
            d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                last = nums.size() -1 ;
                a = nums.get(last);
                nums.remove(last);
                nums.add(0, a);
            }
            for (int j = 0; j < elms; j++) {
                System.out.print(nums.get(j) + " ");
            }
            System.out.println();
            nums.clear();
        }
        sc.close();
    }
}
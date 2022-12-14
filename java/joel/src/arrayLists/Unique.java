package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int elms;
        String a;
        ArrayList<String> nums = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            elms = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < elms; j++) {
                a = sc.nextLine();
                if (! nums.contains(a)) {
                    nums.add(a);
                }
            }
            System.out.println(nums);
            nums.clear();
        }
        sc.close();
    }
}
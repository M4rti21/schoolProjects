package diccionaris;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class desierto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int elms;
        int a = 0;
        int it = -1;
        ArrayList<String> nums = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            elms = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < elms; j++) {
                nums.add(sc.nextLine());
            }
            for (int j = 0; j < elms; j++) {
                if (Collections.frequency(nums, nums.get(j)) > a) {
                    a = Collections.frequency(nums, nums.get(j));
                    it = j;
                }
            }
            System.out.println(nums.get(it));
            a = 0;
            it = -1;
            nums.clear();
        }
        sc.close();
    }
}
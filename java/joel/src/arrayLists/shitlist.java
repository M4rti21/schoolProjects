package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class shitlist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        int n;
        int shitlist = 0;
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            shitlist = 0;
            for (int j = 0; j < 6; j++) {
                list.add(sc.next());
            }
            n = sc.nextInt();
            int[] num = new int[n];
            for (int j = 0; j < n; j++) {
                num[j] = sc.nextInt() - 15;
            }
            for (int j = 0; j < n; j++) {
                if (list.get(num[j]).equals("LoL")) {
                    shitlist += 2;
                } else if (list.get(num[j]).equals("HollowKnight") == false &&
                        list.get(num[j]).equals("DarkSouls") == false &&
                        list.get(num[j]).equals("Zelda") == false &&
                        list.get(num[j]).equals("Eclipse") == false) {
                    shitlist += 1;
                }
            }
            System.out.println("Nivell de Shitlist: " + shitlist);
            list.clear();
        }
        sc.close();
    }
}
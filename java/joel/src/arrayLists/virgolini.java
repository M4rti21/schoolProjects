package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class virgolini {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int a;
        int b;
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            a = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < a; j++) {
                names.add(sc.nextLine());
            }
            if (names.indexOf("Francesco Virgolini") > 0) {
                b = names.indexOf("Francesco Virgolini");
                names.remove(b);
                names.add(b-1, "Francesco Virgolini");
            }
            System.out.println(names);
            names.clear();
        }
        sc.close();
    }
}
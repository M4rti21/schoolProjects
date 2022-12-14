package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ratios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int size;
        int index;
        ArrayList<String> names = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            size = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < size; j++) {
                names.add(sc.next());
            }
            index = sc.nextInt();
            names.remove(index);
            for (int j = 0; j < names.size(); j++) {
                System.out.print(names.get(j) + " ");
            }
            System.out.println();
            names.clear();
        }
        
        sc.close();
    }
}
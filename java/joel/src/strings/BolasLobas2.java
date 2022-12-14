package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class BolasLobas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        ArrayList<Integer> pos = new ArrayList<Integer>();
        for (int i = 0; i < times; i++) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) != str2.charAt(j)) {
                    pos.add(j);
                }
            }
            if (pos.size() < 2) {
                for (int j = 0; j < str1.length() - 1; j++) {
                    for (int l = 0; l < str1.length() - 1; l++) {
                        if (str1.charAt(j) == str1.charAt(l) && pos.size() < 2 && j != l) {
                            pos.add(j);
                        }
                    }
                }
            }
            for (int j = 0; j < pos.size(); j++) {
                System.out.print(pos.get(j) + " ");
            }
            System.out.println();
            pos.clear();
        }
        sc.close();
    }
}
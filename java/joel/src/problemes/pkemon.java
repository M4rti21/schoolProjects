package problemes;

import java.util.ArrayList;
import java.util.Scanner;

public class pkemon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> valids = new ArrayList<Integer>();
        for (int i = 0; i < a; i++) {
            int[] pStr = new int[b];
            int[] pLvl = new int[b];
            for (int j = 0; j < b; j++) {
                pStr[j] = sc.nextInt();
            }
            for (int j = 0; j < b; j++) {
                pLvl[j] = sc.nextInt();
            }
            for (int j = 0; j < b; j++) {
                for (int l = 0; l < b; l++) {
                    if (pStr[j] == pStr[l] && pStr[j] != Integer.MIN_VALUE && !valids.contains(pStr[l])) {
                        if (pLvl[j] > pLvl[l]) {
                            valids.add(pStr[j]);
                            pStr[l] = Integer.MIN_VALUE;
                        } else {
                            valids.add(pStr[l]);
                            pStr[j] = Integer.MIN_VALUE;
                        }
                    }
                }
            }
            for (int j = 0; j < valids.size(); j++) {
                System.out.print(valids.get(j) + " ");
            }
            System.out.println();
            valids.clear();
        }
        sc.close();
    }
}
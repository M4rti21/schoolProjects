package arrayLists;

import java.util.Scanner;

public class tedejo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        String a, b, br;
        br = "";
        char ch;
        boolean good = true;
        for (int i = 0; i < times; i++) {
            a = sc.nextLine();
            b = sc.nextLine();
            for (int j = 0; j < a.length(); j++)
            {
              ch = b.charAt(j);
              br = ch+br;
            }
            for (int j = 0; j < a.length(); j+=2) {
                if (a.charAt(j) != br.charAt(j+1)) {
                    good = false;
                }
            }
            for (int j = 1; j < a.length(); j+=2) {
                if (a.charAt(j) != br.charAt(j-1)) {
                    good = false;
                }
            }
            if (good) System.out.println("SI");
            else System.out.println("NO");
            good = true;
        }
        sc.close();
    }
}
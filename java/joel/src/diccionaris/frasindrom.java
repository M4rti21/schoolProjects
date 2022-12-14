package diccionaris;

import java.util.Scanner;

public class frasindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a, b;
        boolean good = true;
        while (! str.equals(".")) {
            String[] parts = str.split(" ");
            for (int i = 0; i < parts.length-1; i++) {
                a = parts[i];
                b = parts[parts.length-1-i];
                if (! a.equals(b)) {
                    good = false;
                }
            }
            if (good) System.out.println("SI");
            else System.out.println("NO");
            good = true;
            str = sc.nextLine();
            
        }
        sc.close();
    }
}
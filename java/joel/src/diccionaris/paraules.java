package diccionaris;

import java.util.Scanner;

public class paraules {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        int count = 0;
        String str;
        for (int i = 0; i < times; i++) {
            str = sc.nextLine();
            if (str.charAt(0) != ' ')
                count++;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) != ' ' && str.charAt(j - 1) == ' ') {
                    count++;
                }
            }
            System.out.println(count);
            count = 0;
        }
        sc.close();
    }
}
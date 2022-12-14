package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class censura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int k;
        ArrayList<String> censura = new ArrayList<String>();
        String frase;
        for (int i = 0; i < times; i++) {
            k = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < k-1; j++) {
                censura.add(sc.nextLine());
            }
            frase = sc.nextLine();
            for (int j = 0; j < k-1; j++) {
                frase = frase.replace(censura.get(j), "*****");
            }
            System.out.println(frase);
            censura.clear();
        }
        sc.close();
    }
}
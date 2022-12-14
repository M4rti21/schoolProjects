package diccionaris;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class marc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        sc.nextLine();
        LinkedHashMap<String, String> cumples = new LinkedHashMap<String, String>();
        for (int i = 0; i < items; i++) {
            cumples.put(sc.nextLine(), sc.nextLine());
        }
        String find = sc.nextLine();
        System.out.println(cumples);
        for (HashMap.Entry<String, String> cumple : cumples.entrySet()) {
            if (cumple.getKey().equals(find)) {
                System.out.println(cumple.getValue());
            }
        }
        sc.close();
    }
}
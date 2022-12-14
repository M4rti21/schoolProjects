package diccionaris;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class marc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();   
        String txt;
        String amic = "";
        LinkedHashMap<String, String> paisos = new LinkedHashMap<String, String>();
        for (int i = 0; i < times; i++) {
            int items = sc.nextInt();
            sc.nextLine();
            for (int l = 0; l < items-1; l++) {
                txt = sc.nextLine();
                String[] kv = txt.split(" ");
                paisos.put(kv[0], kv[1]);
            }
            String find = sc.nextLine();
            int count = 0;
            for (Entry<String, String> cumple : paisos.entrySet()) {
                if (cumple.getKey().equals(find)) {
                    amic = cumple.getValue();
                }
                count++;
            }
            int count2 = 0;
            for (Entry<String, String> cumple : paisos.entrySet()) {
                count2++;
                if (cumple.getValue().equals(find) && count2 > count) {
                    amic = cumple.getKey();
                }
            }
            System.out.println(amic);
            paisos.clear();
        }
        
        sc.close();
    }
}
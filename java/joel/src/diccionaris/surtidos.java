package diccionaris;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class surtidos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int items;
        String cookie;
        int srt = 0;
        int chg = 0;
        TreeMap<String, Integer> surtidos = new TreeMap<String, Integer>();
        ArrayList<String> toRemove = new ArrayList<String>();
        for (int i = 0; i < times; i++) {
            items = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < items; j++) {
                cookie = sc.nextLine();
                if (surtidos.containsKey(cookie)) {
                    surtidos.put(cookie, surtidos.get(cookie) + 1);
                } else {
                    surtidos.put(cookie, 1);
                }
            }
            while (surtidos.size() > 2) {
                for (Map.Entry<String, Integer> entry : surtidos.entrySet()) {
                    if (entry.getValue() > 0 && chg < 3) {
                        entry.setValue(entry.getValue() - 1);
                        chg++;
                    } else if (chg < 3) {
                        toRemove.add(entry.getKey());
                    }
                }
                if (chg == 3) {
                    srt++;
                }
                chg = 0;
                for (String key : toRemove) {
                    surtidos.remove(key);
                }
            }
            System.out.println(srt);
            surtidos.clear();
            srt = 0;
            chg = 0;
        }
        sc.close();
    }
}

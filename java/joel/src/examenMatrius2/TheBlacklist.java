package examenMatrius2;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

public class TheBlacklist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        int code = 500;
        String txt = "";
        boolean found = false;
        ArrayList<String> toRemove = new ArrayList<String>();
        LinkedHashMap<String, String> list = new LinkedHashMap<String, String>();
        for (int i = 0; i < size; i++) {
            txt = sc.nextLine();
            String[] kv = txt.split(",");
            list.put(kv[0], kv[1]);
        }
        txt = sc.nextLine();
        while (!txt.equals("DIE")) {
            for (Map.Entry<String, String> entry : list.entrySet()) {
                if(entry.getKey().equals(txt) || entry.getValue().equals(txt)) {
                    toRemove.add(entry.getKey());
                    found = true;
                }
            }
            if (found) {
                for (String key : toRemove) {
                    list.remove(key);
                }
                toRemove.clear();
            } else {
                if (txt.charAt(0) == 'N') {
                    list.put(txt, "Nom ocult");
                } else {
                    list.put("N" + code, txt);
                    code++;
                }
            }
            found = false;
            txt = sc.nextLine();
        }
        System.out.println(list);
        sc.close();
    }
}
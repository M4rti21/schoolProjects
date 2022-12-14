package examenMatrius2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PiramidePolvorons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        String txt = "", pol = "";
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        Map<String, Integer> list = new HashMap<String, Integer>();
        for (int i = 0; i < times; i++) {
            txt = sc.nextLine();
            while (!txt.equals("EMPATX")) {
                String[] items = txt.trim().split(" ");
                for (int j = 0; j < items.length; j++) {
                    if (list.containsKey(items[j])) {
                        list.put(items[j], list.get(items[j]) + 1);
                    } else {
                        list.put(items[j], 1);
                    }
                }
                txt = sc.nextLine();
            }
            for (Map.Entry<String, Integer> entry : list.entrySet()) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    pol = entry.getKey();
                }
            }
            String[][] polvorones = new String[list.size()][list.get(pol)];
            for (int o = 0; o < polvorones.length; o++) {
                for (Map.Entry<String, Integer> entry : list.entrySet()) {
                    if (entry.getValue() < min) {
                        min = entry.getValue();
                        pol = entry.getKey();
                    }
                }
                for (int j = 0; j < polvorones[0].length; j++) {
                    if (list.get(pol) > 0) {
                        polvorones[o][j] = pol;
                        list.replace(pol, list.get(pol) - 1);
                    } else {
                        polvorones[o][j] = "";
                    }
                }
                min = Integer.MAX_VALUE;
                list.remove(pol);
            }
            FunctionsClass.print_StringMatrix(polvorones);
            list.clear();
            max = Integer.MIN_VALUE;
            min = Integer.MAX_VALUE;
        }
        sc.close();
    }
}
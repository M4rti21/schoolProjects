package diccionaris;

import java.util.HashMap;
import java.util.Scanner;

public class traviesos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int items;
        String wrd;
        String txt;
        HashMap<String, String> words = new HashMap<String, String>();
        for (int i = 0; i < times; i++) {
            items = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < items; j++) {
                wrd = sc.nextLine();
                String[] parts = wrd.split("-");
                words.put(" " + parts[0] + " ", " " + parts[1] + " ");
            }
            txt = sc.nextLine();
            txt = " " + txt + " ";
            for (HashMap.Entry<String, String> word : words.entrySet()) {
                txt = txt.replace(word.getKey(), word.getValue());
            }
            System.out.println(txt.trim());
            words.clear();
        }
        sc.close();
    }
}
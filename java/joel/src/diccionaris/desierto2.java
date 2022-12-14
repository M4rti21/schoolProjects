package diccionaris;

import java.util.HashMap;
import java.util.Scanner;

public class desierto2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int items;
        String txt;
        int a;
        int bigger = Integer.MIN_VALUE;
        String k = "";
        HashMap<String, Integer> votes = new HashMap<String, Integer>();
        for (int i = 0; i < times; i++) {
            items = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < items; j++) {
                txt = sc.nextLine();
                a = Character.getNumericValue(txt.charAt(txt.length()-1));
                txt = txt.replace(""+txt.charAt(txt.length()-1), "").trim();
                if(votes.containsKey(txt)) {
                    votes.put(txt, votes.get(txt)+ a);
                } else {
                    votes.put(txt, a);
                }
            }
            for (HashMap.Entry<String, Integer> vote : votes.entrySet()) {
                if (vote.getValue() > bigger) {
                    bigger = vote.getValue();
                    k = vote.getKey();
                }
            }
            System.out.println(k);
            k = "";
            bigger = Integer.MIN_VALUE;
            votes.clear();
        }
        sc.close();
    }
}
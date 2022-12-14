package examenMatrius;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Nadales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int lines;
        int check;
        String txt;
        LinkedHashMap<String, Integer> nadala = new LinkedHashMap<String, Integer>();
        for (int i = 0; i < times; i++) {
            lines = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < lines; j++) {
                txt = sc.nextLine();
                String[] arr = txt.split(" ");
                for (int k = 0; k < arr.length; k++) {
                    if (nadala.containsKey(arr[k])) {
                        nadala.put(arr[k], nadala.get(arr[k])+1);
                    } else if (arr[k].length() > 2){
                        nadala.put(arr[k], 1);
                    }
                }
            }
            check = sc.nextInt();
            for (HashMap.Entry<String, Integer> paraula : nadala.entrySet()) {
                if (paraula.getValue() == check) {
                    System.out.println(paraula.getKey());
                }
            }
            nadala.clear();
        }
        sc.close();
    }
}
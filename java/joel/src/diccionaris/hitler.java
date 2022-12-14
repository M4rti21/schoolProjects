package diccionaris;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class hitler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int items;
        String txt;
        String[] a = new String[2];
        String b = "";
        String k = "";
        HashMap<String, Integer> votes = new HashMap<String, Integer>();
        for (int i = 0; i < times; i++) {
            items = sc.nextInt();
            sc.nextLine();
            String[] list = new String[items*2];
            for (int j = 0; j < items; j++) {
                txt = sc.nextLine();
                a = txt.split("->");
            }
            System.out.println(a[0]);
            System.out.println(a[1]);
        }
        sc.close();
    }
}
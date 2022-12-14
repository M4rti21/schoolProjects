package diccionaris;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class arnau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int items;
        char cmg = '"';
        String txt, search;
        TreeMap<String, String> versiculos = new TreeMap<String, String>();
        for (int i = 0; i < times; i++) {
            items = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < items; j++) {
                txt = sc.nextLine();
                String arr[] = txt.split(" ", 2);
                if(Character.isDigit(arr[1].charAt(0))) {
                    int cnt = 0;
                    String num = "";
                    while(Character.isDigit(arr[1].charAt(cnt)) || arr[1].charAt(cnt) == ' ') {
                        if (arr[1].charAt(cnt) == ' ' && Character.isDigit(arr[1].charAt(cnt+1))) {
                            num += ":";
                        } else if (Character.isDigit(arr[1].charAt(cnt))) {
                            num += arr[1].charAt(cnt);
                        }
                        cnt++;
                    }
                    versiculos.put(arr[0]+num, arr[1].substring(num.length()).trim());
                } else {
                    versiculos.put(arr[0], arr[1]);
                }
            }
            search = sc.nextLine().toLowerCase();
            System.out.println(versiculos);
            for (Map.Entry<String, String> versiculo : versiculos.entrySet()) {
                if (versiculo.getKey().toString().toLowerCase().contains(search)) {
                    System.out.println(cmg+versiculo.getValue()+cmg);
                }
            }
            versiculos.clear();
            versiculos.clear();
        }
        sc.close();
    }
}
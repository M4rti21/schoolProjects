package arraysSimples;

import java.util.Scanner;

public class ABBA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        sc.nextLine();
        String a;
        boolean name = false;
        String names = "";
        boolean ifound = false;
        for (int i = 0; i < times; i++) {
            a = sc.nextLine();
            for (int j = a.length()-1; j >= 0; j--) {
                if (name) {
                    names += a.charAt(j);
                    name = false;
                } else if (a.charAt(j) == ' ' && a.charAt(j+1) == ',') {
                        name = true;
                } else if (a.charAt(j) == ' ' && a.charAt(j+1) == 'i' && a.charAt(j+2) == ' ' && ifound == false) {
                        name = true;
                        ifound = true;
                }
            }
            System.out.println(names);
            names = "";
            name = true;
        }
        sc.close();
    } 
}

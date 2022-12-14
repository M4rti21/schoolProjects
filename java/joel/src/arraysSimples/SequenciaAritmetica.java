package arraysSimples;

import java.util.Scanner;

public class SequenciaAritmetica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int a = 0;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int x = 0;
        boolean ex = false;
        for (int i = 0; i < 3; i++) {
            ex = false;
            str = sc.nextLine();
            String[] splited = str.trim().split("\\s+");
            for (int j = 0; j < splited.length; j++) {
                if (!splited[j].equals("X")) {
                    if (j == 0)
                        a1 = Integer.parseInt(splited[j]);
                    if (j == 1)
                        a2 = Integer.parseInt(splited[j]);
                    if (j == 2)
                        a3 = Integer.parseInt(splited[j]);
                } else {
                    x = j;
                    ex = true;
                }
            }
            if (ex) {
                switch (x) {
                    case 0:
                        1r = a2 - (a3 - a2);
                        break;
                    case 1:
                        2n = ((a3 - a1) / 2) + a1;
                        break;
                    case 2:
                         = a1 + (2 * (a2 - a1));
                        break;
                }

                for (int j = 0; j < splited.length; j++) {
                    if (!splited[j].equals("X")) {
                        splited[j] = "" + a;
                    }
                }
            }
            for (int j = 0; j < splited.length; j++) {
                System.out.print(splited[j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

package arraysSimples;

import java.util.Scanner;

public class CambialoPoco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        String cave = "";
        int tunels;
        int diamonds = 0;
        for (int i = 0; i < times; i++) {
            tunels = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < tunels; j++) {
                cave = sc.nextLine();
                for (int l = 0; l < cave.length() -1; l++) {
                    if (cave.charAt(l) == '{' && cave.charAt(l+1) == '}') diamonds++;
                }
            }
            System.out.println(diamonds);
            diamonds = 0;
        }
        sc.close();
    } 
}

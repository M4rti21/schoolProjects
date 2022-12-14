package examenMatrius2;

import java.util.Scanner;

public class IllaDelTresor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt(), x = sc.nextInt();
        int n = Integer.MAX_VALUE, s = Integer.MIN_VALUE, e = Integer.MAX_VALUE, d = Integer.MIN_VALUE;
        int tresorX = 0, tresorY = 0;
        char[][] map = new char[y][x];
        FunctionsClass.fill_CharacterMatrix(map, sc);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if (map[i][j] == 'X') {
                    if (i < n) n = i;
                    if (i > s) s = i;
                    if (j < e) e = j;
                    if (j > d) d = j;
                }
            }
        }
        tresorY = s - ((s - n) / 2);
        tresorX = d - ((d - e) / 2);
        System.out.println(tresorY + " " + tresorX);
        map[tresorY][tresorX] = 'O';
        FunctionsClass.print_CharacterMatrix(map);
        sc.close();
    }
}
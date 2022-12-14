package problemes;

import java.util.Scanner;

public class volRasant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int items;
        for (int t = 0; t < times; t++) {
            items = sc.nextInt();
            int[] terrain = new int[items];
            for (int i = 0; i < items; i++) {
                terrain[i] = sc.nextInt() + 1;
            }
            for (int o = 0; o < items; o++) {
                if (terrain.length > 1) {
                    if (terrain[0] < terrain[1]) {
                        terrain[0] = terrain[1] - 1;
                    }
                    if (terrain[terrain.length - 1] < terrain[terrain.length - 2]) {
                        terrain[terrain.length - 1] = terrain[terrain.length - 2] - 1;
                    }
                    for (int i = 1; i < items - 1; i++) {
                        if (terrain[i] < terrain[i + 1]) {
                            terrain[i] = terrain[i + 1] - 1;
                        }
                        if (terrain[i] < terrain[i - 1]) {
                            terrain[i] = terrain[i - 1] - 1;
                        }
                    }
                }
            }
            for (int i = 0; i < items; i++) {
                System.out.print(terrain[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
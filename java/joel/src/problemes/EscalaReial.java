package problemes;

import java.util.Arrays;
import java.util.Scanner;

public class EscalaReial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        boolean rei = false;
        boolean esc = false;
        for (int i = 0; i < times; i++) {
            int[] arr = new int[7];
            for (int j = 0; j < 7; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            for (int j = 1; j < 7; j++) {
                if (arr[j - 1] == arr[j])
                    arr[j] += 1000;
            }
            Arrays.sort(arr);
            for (int j = 0; j < 3; j++) {
                if (arr[j + 1] == arr[j] + 1 && arr[j + 2] == arr[j] + 2 && arr[j + 3] == arr[j] + 3
                        && arr[j + 4] == arr[j] + 4) {
                    esc = true;
                }
            }
            for (int j = 3; j < 7; j++) {
                if (arr[j] == 13 && arr[j - 1] == 12 && arr[j - 2] == 11) {
                    rei = true;
                }
            }
            if (rei)
                System.out.println("ESCALA REIAL");
            else if (esc)
                System.out.println("ESCALA");
            else
                System.out.println("NO");
            rei = false;
            esc = false;
        }
        sc.close();
    }
}
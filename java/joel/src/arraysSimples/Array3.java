package arraysSimples;

import java.util.ArrayList;
import java.util.Scanner;

public class Array3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrl = new ArrayList<Integer>();
        int a = sc.nextInt();
        while (a != -1) {
            arrl.add(a);
            a = sc.nextInt();
        }
        int b = sc.nextInt();
        System.out.println(arrl);
        System.out.println(arrl.get(b));
        sc.close();
    } 
}

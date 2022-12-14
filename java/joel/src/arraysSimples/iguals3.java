package arraysSimples;

import java.util.Scanner;

public class iguals3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int a = a1 + a2 + a3;
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();
        int b = b1 + b2 + b3;
        
        if (a>b) System.out.println("A");
        else if (b > a) System.out.println("B");
        else System.out.println("T");
        
        
        sc.close();
    } 
}

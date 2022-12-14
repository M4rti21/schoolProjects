package examenMatrius;

import java.util.ArrayList;
import java.util.Scanner;

public class DuplicatsDuplicats {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int [][] id = new int[x][y];
        boolean noHdup = true;
        boolean noVdup = true;
        FunctionsClass.fill_IntegerMatrix(id, sc);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for (int i = 0; i < id.length; i++) {
            for (int j = 0; j < id[0].length; j++) {
                nums.add(id[i][j]);
            }
            
            
            
            
            for (int j = 0; j < id[0].length; j++) {
                if (nums.indexOf(nums.get(j)) != nums.lastIndexOf(nums.get(j))) {
                    noHdup = false;
                }
            }
            nums.clear();
            
        }
        

        for (int i = 0; i < id[0].length; i++) {
            for (int j = 0; j < id.length; j++) {
                nums.add(id[j][i]);
            }
            for (int j = 0; j < id.length; j++) {
                if (nums.indexOf(nums.get(j)) != nums.lastIndexOf(nums.get(j))) {
                    noVdup = false;
                }
            }
            nums.clear();
        }
        if (noHdup && noVdup) {
            System.out.println("No hi ha repeticions");
        } else if (noHdup) {
            System.out.println("Hi ha repeticions en V");
        } else if (noVdup) {
            System.out.println("Hi ha repeticions en H");
        } else {
            System.out.println("Hi ha repeticions en TOT");
        }
        sc.close();
    }
}
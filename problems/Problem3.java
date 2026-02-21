

import java.util.Scanner;

// Print Solid reactangle

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row size: ");
        int row = sc.nextInt();
        System.out.println("Enter the column size: ");
        int column = sc.nextInt();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
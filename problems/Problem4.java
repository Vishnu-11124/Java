

import java.util.Scanner;

// Print Hollow reactangle

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row size: ");
        int row = sc.nextInt();
        System.out.println("Enter the column size: ");
        int column = sc.nextInt();

        // for(int i = 1; i <= row; i++){
        //     if(i == 1 || i == row){
        //         for(int j = 1; j <= column; j++){
        //             System.out.print("*");
        //         }
        //     }else{
        //         for(int j = 1; j <= column; j++){
        //             if(j == 1 || j == column){
        //                 System.out.print("*");
        //             }
        //             else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     }

        //     System.out.println();
        // }

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                if(i == 1 || i == row || j == 1 || j == column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
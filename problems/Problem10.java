
// Floyd's Triangle

// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 
// 11 12 13 14 15 
// 16 17 18 19 20 21 

public class Problem10 {
    public static void main(String[] args) {

        int num = 6;
        int newNum = 0;
    
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                newNum += 1;
                System.out.print(newNum  + " ");
            }
            System.out.println();
        }
    }
}
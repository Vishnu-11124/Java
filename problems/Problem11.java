
// 0-1 Triangle

// 1
// 01
// 010
// 1010
// 10101
// 010101

public class Problem11 {
    public static void main(String[] args) {
        
        int num = 6;
        int val = 1;
    
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(val);
                val = val == 1 ? 0 : 1;   
            }
            System.out.println();
        }
    }
}

// Half pyramid with numbers

// 1
// 12
// 123
// 1234
// 12345
// 123456

public class Problem8 {
    public static void main(String[] args) {

        int num = 6;
    
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
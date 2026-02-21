
import java.util.Scanner;

// Print the Number table

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(i + "*" + n + "=" + n*i);
        }
    }
}
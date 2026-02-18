
import java.util.Scanner;

// Output, Variables, Data Types, Input

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        int age = 25;
        double price = 45.76;
        System.out.println("Hello, " + name + "!");
        System.out.println("Welcome to Java");
        System.out.println("Age is: " + age);
        System.out.println("Price is: " + price);
    }
}


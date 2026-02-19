import java.util.Scanner;

class Switch {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a button (1-3): ");
        int button = sc.nextInt();

        switch (button) {
            case 1 ->
                System.out.println("Hello");
            case 2 ->
                System.out.println("Namaste");
            case 3 ->
                System.out.println("Bonjour");
            default ->
                System.out.println("Invalid button");
        }


        sc.close(); // good practice
    }
}

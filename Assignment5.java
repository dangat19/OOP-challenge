import java.util.Scanner;

public class HelloTillShop {
    Scanner scanner = new Scanner(System.in);

    public void showHello() {
        String input;
        System.out.println("Type 'h' to say Hello. Type anything else to stop.");
        input = scanner.next();
        while ("h".equalsIgnoreCase(input)) {
            System.out.println("Hello, shopper!");
            input = scanner.next();
        }
        System.out.println("Thank you for visiting!");
    }

    public static void main(String[] args) {
        (new HelloTillShop()).showHello();
    }
}
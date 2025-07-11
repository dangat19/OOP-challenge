import java.util.Scanner;

public class Choices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.println("Welcome to the Voting Eligibility Checker");

        while (true) {
            System.out.print("Please enter your age: ");

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();

                if (age >= 18) {
                    System.out.println("Access granted! You are eligible to vote.");
                    break;
                } else if (age > 0) {
                    System.out.println("Sorry, you must be 18 or older to vote.");
                    break;
                } else {
                    System.out.println("Invalid age. Please enter a positive number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
        }
    }
}
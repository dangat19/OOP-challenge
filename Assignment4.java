import java.util.Scanner;

public class InputExample {
    Scanner scanner = new Scanner(System.in);

    public void readNameAndAge() {
        System.out.print("What is your full name? ");
        String name = scanner.nextLine();
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        System.out.println("Hi " + name + ", you are " + age + " years young!");
    }

    public static void main(String[] args) {
        (new InputExample()).readNameAndAge();
    }
}
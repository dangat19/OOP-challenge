public class Variables {
    void showInterest() {
        double amount = 5000.00;
        double interestRate = 5.0;
        System.out.println("Initial amount: " + amount);
        amount = amount * (100 + interestRate) / 100;
        System.out.println("After 1 year: " + amount);
        amount = amount * (100 + interestRate) / 100;
        System.out.println("After 2 years: " + amount);
    }
    public static void main(String[] args) {
        (new Variables()).showInterest();
    }
}
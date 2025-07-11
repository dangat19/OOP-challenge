package challenge7;
public class MainApplication {

    public static void main(String[] args) {
        Admin curAdmin = new Admin(1001, "Alice", "admin123");
        User curUser = new User(2002, "Bob");

        curAdmin.performOperation(new Update()); // Admin updates the data
        curUser.performOperation(new View());    // User views the data
    }
}
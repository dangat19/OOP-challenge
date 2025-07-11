package challenge7;
public class Admin extends Account {

    public Admin(int _id, String _name, String _password) {
        id = _id;
        name = _name;
        // Password is currently not stored for security reasons in this version
    }
}
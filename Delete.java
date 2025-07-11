package challenge7;
public class Delete implements DataSource {

    @Override
    public void execute() {
        System.out.println("Record deleted from the database.");
    }
}
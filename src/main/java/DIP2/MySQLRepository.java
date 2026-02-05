package DIP2;

public class MySQLRepository implements DatabaseRepository{

    @Override
    public void save(String username) {
        System.out.println("Saving to MySQL: " + username);
    }
}

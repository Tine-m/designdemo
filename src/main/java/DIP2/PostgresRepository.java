package DIP2;

public class PostgresRepository implements DatabaseRepository{
    @Override
    public void save(String username) {
        System.out.println("Saving to Postgres: " + username);
    }
}

package DIP;

public class PostgresRepository {
    public void save(String username) {
        System.out.println("Saving to Postgres: " + username);
    }
}

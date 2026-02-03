package DIP;

/*
UserService class is dependent on MYSQLRepository
We want a solution where the class is dependent on
abstraction, NOT concrete class - e.g. if we want to change
to different repository solution = Dependendy Injection.
Use UserRepository interface to fix this
 */
class UserService {
private final MySQLRepository repo = new MySQLRepository();

public void register(String username) {
    repo.save(username);
}
    }
package DIP2;

public class UserService {

    private DatabaseRepository repository;

    public UserService(DatabaseRepository repository) {
        this.repository = repository;
    }

    public void register(String username) {
        repository.save(username);
    }
}

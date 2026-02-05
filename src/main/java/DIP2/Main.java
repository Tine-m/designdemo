package DIP2;

public class Main {

    public static void main(String[] args) {
        UserService service = new UserService(new MySQLRepository());
        service.register("Tine");
    }
}

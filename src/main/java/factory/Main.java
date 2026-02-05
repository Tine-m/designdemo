package factory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vælg type: email eller sms: ");
        String type = scanner.next();
        System.out.println("Indtast besked");
        String message = scanner.next();

        service.notifyUser(type, message);
    }
}

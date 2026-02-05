package factory;

public class NotificationService {

    public void notifyUser(String type, String message) {
        Notification notification =
                NotificationFactory.create(type);

        notification.send(message);
    }
}
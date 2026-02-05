package factory;

public class NotificationFactory {

    public static Notification create(String type) {
        return switch (type) {
            case "email" -> new EmailNotification();
            case "sms"   -> new SmsNotification();
            default -> throw new IllegalArgumentException("Unknown type");
        };
    }
}
// Notifier interface
interface Notifier {
    void sendNotification(String message);
    String getNotificationType();
}

// EmailNotifier class
class EmailNotifier implements Notifier {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending Email Notification: " + message);
    }

    @Override
    public String getNotificationType() {
        return "Email";
    }
}

// SMSNotifier class
class SMSNotifier implements Notifier {

    @Override
    public void sendNotification(String message) {
        System.out.println("Sending SMS Notification: " + message);
    }

    @Override
    public String getNotificationType() {
        return "SMS";
    }
}

// Main class to test notification system
public class NotificationTest {

    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifier();

        emailNotifier.sendNotification("Welcome to our service!");
        smsNotifier.sendNotification("Your verification code is 123456.");

        System.out.println("Notification Type (Email): " + emailNotifier.getNotificationType());
        System.out.println("Notification Type (SMS): " + smsNotifier.getNotificationType());
    }
}


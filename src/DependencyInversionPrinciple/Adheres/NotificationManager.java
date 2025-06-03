package DependencyInversionPrinciple.Adheres;

public class NotificationManager {
    private NotificationService notificationService;

    // Dependency injection through constructor
    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message) {
        notificationService.send(message); // Uses abstraction!
    }

    public static void main(String[] args) {
        // Dependencies injected from outside
        NotificationManager emailManager = new NotificationManager(new EmailService());
        NotificationManager smsManager = new NotificationManager(new SMSService());
        NotificationManager pushManager = new NotificationManager(new PushNotificationService());

        emailManager.sendNotification("Hello via Email!");
        smsManager.sendNotification("Hello via SMS!");
        pushManager.sendNotification("Hello via Push!"); // New feature, no changes needed!
    }
}

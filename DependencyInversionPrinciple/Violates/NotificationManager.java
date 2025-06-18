package DependencyInversionPrinciple.Violates;

public class NotificationManager {
    private EmailService emailService; // Direct dependency!
    private SMSService smsService;     // Direct dependency!

    public NotificationManager() {
        this.emailService = new EmailService(); // Tight coupling!
        this.smsService = new SMSService();     // Tight coupling!
    }

    public void sendNotification(String message, String type) {
        if (type.equals("email")) {
            emailService.sendEmail(message);
        } else if (type.equals("sms")) {
            smsService.sendSMS(message);
        }
    }
}
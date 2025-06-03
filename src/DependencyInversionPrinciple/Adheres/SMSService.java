package DependencyInversionPrinciple.Adheres;

public class SMSService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

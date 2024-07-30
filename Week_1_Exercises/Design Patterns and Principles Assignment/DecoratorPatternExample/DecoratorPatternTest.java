public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Creating a basic EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Decorating the EmailNotifier with SMS and Slack notifications
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Sending notifications via multiple channels
        slackNotifier.send("Hello, World!");
    }
}

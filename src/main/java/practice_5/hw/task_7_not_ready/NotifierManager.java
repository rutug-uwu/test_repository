package practice_5.hw.task_7_not_ready;

public class NotifierManager {

     public static Notifier getNotifier(NotifierType type) {
        return switch (type) {
            case TELEGRAM -> new TelegramNotifier();
            case APP -> new AppNotifier();
            case EMAIL -> new EmailNotifier();
        };
    }

    public static void sendMessage(User user, NotifierType type, String text) {
        Notifier notifier = getNotifier(type);

        notifier.notifyNew(user,text);
    }
}

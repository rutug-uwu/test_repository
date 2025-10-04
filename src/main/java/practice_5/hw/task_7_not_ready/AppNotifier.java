package practice_5.hw.task_7_not_ready;

public class AppNotifier implements Notifier {

    @Override
    public void notifyNew(User user, String text) {
        System.out.println("Сообщение отправлено на телефон, текст сообщения: " + text);
    }
}

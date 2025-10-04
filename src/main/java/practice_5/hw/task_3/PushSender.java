package practice_5.hw.task_3;

public class PushSender implements NotificationSender {

    @Override
    public void send(String message) {
        System.out.println("Отправка сообщения по push: " + message);
    }
}

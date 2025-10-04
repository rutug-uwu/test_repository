package practice_5.hw.task_3;

public class SmsSender implements NotificationSender{

    @Override
    public void send(String message) {
        System.out.println("Отправка сообщения по смс: " + message);
    }
}

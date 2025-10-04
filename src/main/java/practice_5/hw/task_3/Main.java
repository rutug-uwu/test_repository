package practice_5.hw.task_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender pushSender = new PushSender();
        NotificationSender smsSender = new SmsSender();

        List <NotificationSender> senders = Arrays.asList(emailSender, pushSender, smsSender);
        NotificationService.notifyUsers(senders,"Ты в долговой яме!");
    }
}

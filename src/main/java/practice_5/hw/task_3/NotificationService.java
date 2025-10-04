package practice_5.hw.task_3;

import java.util.List;

public class NotificationService {
    public static void notifyUsers(List<NotificationSender> senders, String msg){
        for (int i = 0; i < senders.size(); i++){
           NotificationSender sender = senders.get(i);
           sender.send(msg);
        }
    }
}

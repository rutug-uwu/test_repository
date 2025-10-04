package practice_5.hw.task_7_not_ready;

public class Main {
    public static void main(String[] args) {
        User timur = new User();
        NotifierManager.sendMessage(timur, NotifierType.TELEGRAM, "Ты в долговой яме, дружочег");
        NotifierManager.sendMessage(timur, NotifierType.EMAIL, "Привет");
    }
}

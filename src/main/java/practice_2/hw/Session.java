package practice_2.hw;

public class Session {
    private static int activeSessionCounter = 0;

    String nameOfSession;
    String sessionId;

    public Session(String nameOfSession, String sessionId) {
        this.nameOfSession = nameOfSession;
        this.sessionId = sessionId;
        activeSessionCounter++;
    }

    public static int close(){
        activeSessionCounter = activeSessionCounter - 1;

        return activeSessionCounter;
    }

    public static int getActiveSessionCounter() {
        return activeSessionCounter;
    }
}

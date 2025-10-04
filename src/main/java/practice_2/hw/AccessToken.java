package practice_2.hw;

public class AccessToken {
    String tokenDescription;
    private final String token;

    public AccessToken(String token, String tokenDescription) {
        this.token = token;
        this.tokenDescription = tokenDescription;
    }

    public String getToken() {
        return token;
    }
}

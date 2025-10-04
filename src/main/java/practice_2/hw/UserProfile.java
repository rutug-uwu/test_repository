package practice_2.hw;

public class UserProfile {
    public String name;
    private final String passport;

    public UserProfile(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    public String getPassport() {
        return passport;
    }
}

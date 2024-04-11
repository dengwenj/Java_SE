package pm.ww1;

public class User {
    private String username;
    private String password;
    private String sfz;
    private String phoneNumber;

    public User() {

    }

    public User(String username, String password, String sfz, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.sfz = sfz;
        this.phoneNumber = phoneNumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setSfz(String sfz) {
        this.sfz = sfz;
    }

    public String getSfz() {
        return sfz;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

package pm.ww3;

public class User {
    // 标准的 javabean
    private String userName;
    private String password;
    private String rePassword;
    private String email;
    private char sex;
    private int age;

    // 无参构造器
    public User() {
        System.out.println("无参构造器");
    }

    // 有参构造器
    public User(
        String userName,
        String password,
        String rePassword,
        String email,
        char sex,
        int age
    ) {
        setUserName(userName);
        setPassword(password);
        setRePassword(rePassword);
        setEmail(email);
        setSex(sex);
        setAge(age);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void register() {
        System.out.println("点击注册");
    }
}

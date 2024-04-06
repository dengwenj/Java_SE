package pm.ww3;

public class Test {
    public static void main(String[] args) {
        User u2 = new User();
        User u1 = new User(
            "朴睦",
            "123456",
            "123456",
            "111@qq.com",
            '男',
            24
        );

        System.out.println(u1.getUserName());
        System.out.println(u1.getPassword());
        System.out.println(u1.getRePassword());
        System.out.println(u1.getEmail());
        System.out.println(u1.getSex());
        System.out.println(u1.getAge());

        u1.register();
    }
}

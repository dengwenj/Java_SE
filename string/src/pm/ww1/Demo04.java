package pm.ww1;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        // 用户登录
        String userName = "朴睦";
        String password = "1233211234567";

        Scanner scanner = new Scanner(System.in);
        // 3次机会
        int l = 3;
        for (int i = 0; i < l; i++) {
            System.out.println("请输入用户名");
            String name = scanner.next();
            System.out.println("请输入密码");
            String pw = scanner.next();

            if (name.equals(userName) && pw.equals(password)) {
                System.out.println("登录成功");
                break;
            }

            // 登录不成功
            if (i == l - 1) {
                System.out.println("最后一次机会也没有了，锁定了");
            } else {
                System.out.println("用户名或密码错误，请重新登录，还有" + (l - i - 1) + "次机会" );
            }
        }
    }
}

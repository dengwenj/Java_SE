package vip.dengwj.object;

import com.google.gson.Gson;

public class Test3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User u1 = new User("朴睦", 24, new int[]{1, 2, 3, 4, 5});

        // 强转成 User 类型
        User u2 = (User) u1.clone();

        int[] data = u1.getData();
        data[0] = 100;
        System.out.println(u1);
        System.out.println(u2);

        // 深克隆，第三方
        Gson gson = new Gson();
        String s = gson.toJson(u1);
        User user = gson.fromJson(s, User.class);
        System.out.println(user);
    }
}

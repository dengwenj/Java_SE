package pm.anli.demo06;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Client {
    // 拿到用户名和密码
    private static final HashMap<String, String> user = new HashMap<>();

    public static void main(String[] args) throws IOException {
        // 聊天室

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new FileReader("_network/src/pm/anli/demo06/info.txt"));

        String str;
        while ((str = br.readLine()) != null) {
            String[] split = str.split("=");
            user.put(split[0], split[1]);
        }

        // 先登录
        while (true) {
            System.out.println("---------欢迎来到朴睦聊天室----------");
            System.out.println("1.登录");
            String s = sc.nextLine();

            // 说明不是登录的
            if (!"1".equals(s)) {
                // 重写循环
                continue;
            }

            // 说明是登录
            System.out.println("请输入用户名");
            String name = sc.nextLine();
            Set<String> keys = user.keySet();
            boolean username = isUsername(keys, name);
            if (!username) {
                System.out.println("用户名不存在，请重新输入");
                continue;
            }

            // 说明用户名正确，然后输入密码
            System.out.println("请输入密码");
            String password = sc.nextLine();

            // 密码错误
            if (!isPassword(name, password)) {
                System.out.println("密码错误，请重新输入");
                continue;
            }

            // 密码正确，退出循环，可以进行聊天了
            break;
        }

        // 创建 Socket 对象
        Socket s = new Socket("127.0.0.1", 1209);

        while (true) {
            System.out.println("请输入想说的话");
            String str1 = sc.nextLine();
            if ("886".equals(str1)) {
                break;
            } else {
                OutputStream outputStream = s.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(outputStream);
                osw.write(str1);
                // 刷新
                osw.flush();

                InputStream inputStream = s.getInputStream();
                BufferedReader br1 = new BufferedReader(new InputStreamReader(inputStream));
                String data = br1.readLine();
                System.out.println(data);

                br1.close();
            }
        }

        s.close();
    }

    // 是否存在该用户名
    public static boolean isUsername(Set<String> keys, String name) {
        for (String key : keys) {
            // 说明存在
            if (key.equals(name)) {
                return true;
            }
        }

        return false;
    }

    // 密码是否错误
    public static boolean isPassword(String name, String password) {
        return user.get(name).equals(password);
    }
}

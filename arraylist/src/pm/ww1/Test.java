package pm.ww1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<User> userArrayList = new ArrayList<>();
        user:
        while (true) {
            // 只有用户登录成功之后，才能进入到学生管理系统
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1:登录 2:注册 3:忘记密码");
            String op = scanner.next();
            switch (op) {
                case "1" -> {
                    // 登录成功跳出
                    if (login(userArrayList, scanner)) {
                        break user;
                    }
                }
                case "2" -> {
                    register(userArrayList, scanner);
                    // 注册成功
                    break user;
                }
                case "3" -> {
                    if (forgetPassword(userArrayList, scanner)) {
                        break user;
                    }
                }
                default -> {
                    System.out.println("输入有误");
                }
            }
        }


        // 菜单开始输入
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("-----欢迎来到学生管理系统-----");
            System.out.println("1: 添加学生");
            System.out.println("2: 删除学生");
            System.out.println("3: 修改学生");
            System.out.println("4: 查询学生");
            System.out.println("5: 退出");
            System.out.println("请输入您的选择:");

            String input = scanner.next();

            boolean flag = false;
            switch (input) {
                case "1" -> {
                    addStudent(list, scanner);
                }
                case "2" -> {
                    deleteStudent(list, scanner);
                }
                case "3" -> setStudent(list, scanner);
                case "4" -> getStudent(list);
                case "5" -> {
                    exit();
                    flag = true;
                }
                default -> System.out.println("请输入正确的");
            }
            if (flag) {
                break;
            }
        }
    }

    // 登录
    public static boolean login(ArrayList<User> list, Scanner sc) {
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();

        String yzm = yzCode();
        System.out.println("请输入验证码");
        System.out.println("验证码是：" + yzm);
        String code = sc.next();

        // 用户名未注册，直接结束方法，提示：用户名未注册，请先注册
        User u = null;
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            User user = list.get(i);
            if (user.getUsername().equals(username)) {
                flag = true;
                u = user;
                break;
            }
        }
        // 说明没有注册用户
        if (!flag) {
            System.out.println("用户名未注册，请先注册");
            return false;
        }

        System.out.println(code);
        System.out.println(code.equals(yzm));
        // 判断验证码是否正确，验证码不对一直输入
        while (!code.equals(yzm)) {
            System.out.println("验证码错误请重新输入");
            System.out.println("验证码是：" + yzm);
            code = sc.next();
        }

        // 判断用户名和密码是否正确 3次机会
        // 2 的原因是前面输入了一次机会
        for (int i = 0; i < 2; i++) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)) {
                System.out.println("登录成功");
                return true;
            }
            System.out.println("用户名或密码错误，请重新输入");
            System.out.println("还有" + (2 - i) + "次机会");
            System.out.println("请输入用户名");
            username = sc.next();
            System.out.println("请输入密码");
            password = sc.next();
        }
        return false;
    }

    public static String yzCode() {
        // 随机生成一个验证码长度为 5
        // 由 4 位大写或者小写字母和 1 位数字组成
        // 数字可出现在任意位置
        // 例如：aFr3Q
        // 查表法 大小写
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i < 26) {
                chars[i] = (char) (65 + i);
            } else {
                chars[i] = (char) (97 + i - 26);
            }
        }
        ArrayList<String> strList = new ArrayList<>();
        char[] code = new char[5];
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int idx = r.nextInt(chars.length);
            code[i] = chars[idx];
        }
        // 0 - 4 随机
        int numIdx = r.nextInt(5);
        int numVal = r.nextInt(10);
        System.out.println(numVal);
        char temp = code[numIdx];
        code[numIdx] = (numVal + "").charAt(0);
        code[code.length - 1] = temp;

        return new String(code);
    }

    // 注册
    public static void register(ArrayList<User> list, Scanner sc) {
        // 用户名
        String username;
        while (true) {
            System.out.println("请输入用户名");
            username = sc.next();

            boolean flag = true;
            for (int i = 0; i < list.size(); i++) {
                User u = list.get(i);
                if (u.getUsername().equals(username)) {
                    System.out.println("用户名已被注册，请重新输入");
                    flag = false;
                   break;
                }
            }

            int unLen = username.length();
            // 用户名唯一
            if (flag) {
                // 用户名长度必须在 3 -15 位之间
                if (unLen >= 3 && unLen <= 15) {
                    // 只能是数字加字母
                    int numCount = 0;
                    int zmCount = 0;
                    for (int i = 0; i < unLen; i++) {
                        char c = username.charAt(i);
                        if (c >= 'a' && c <= 'z') {
                            zmCount++;
                        } else if (c >= 'A' && c <= 'Z') {
                            zmCount++;
                        } else if (c >= '0' && c <= '9') {
                            numCount++;
                        }
                    }

                    if (numCount != unLen && zmCount != unLen) {
                        break;
                    } else {
                        // 说明是纯数字或纯字母
                        System.out.println("只能是数字加字母，请重新输入");
                    }
                } else {
                    System.out.println("用户名长度必须在 3 -15 位之间，请重新输入");
                }
            }
        }

        // 密码
        String password;
        String password2;
        while (true) {
            System.out.println("请输入密码");
            password = sc.next();
            System.out.println("请再次输入密码");
            password2 = sc.next();

            if (password.equals(password2)) {
                break;
            }
            System.out.println("两次密码不一致，请重新输入");
        }

        // 身份证
        String sfz;
        sfzCode:
        while (true) {
            System.out.println("请输入身份证号码");
            sfz = sc.next();

            int sfzLen = sfz.length();
            if (sfzLen == 18) {
                for (int i = 0; i < sfzLen; i++) {
                    char c = sfz.charAt(i);
                    // 第一位不能为 0，也必须是数字
                    if (i == 0) {
                        if ((c + "").equals("0")) {
                            System.out.println("身份证号码第一位不能为 0，请重新输入");
                            break;
                        }
                    }
                    // 第一位不能为 0，也必须是数字，就会进入这里
                    // 前 17 位必须是数字
                    if (i < sfzLen - 1) {
                        if (c < '0' || c > '9') {
                            System.out.println("前 17 位必须是数字，请重新输入");
                            break;
                        }
                    }
                    // 最后一位，可以是数字可以是X x
                    if (i == sfzLen - 1) {
                        if (c == 'X' || c == 'x' || (c >= '0' && c <= '9')) {
                            // 全都通过，退出 while 循环
                            break sfzCode;
                        } else {
                            System.out.println("最后一位，可以是数字可以是X或x");
                        }
                    }
                }
            } else {
                System.out.println("身份证号码长度需要 18 位，请重新输入");
            }
        }

        // 手机号验证
        String phoneNum;
        while (true) {
            System.out.println("请输入手机号");
            phoneNum = sc.next();

            int phoneNumLen = phoneNum.length();
            if (phoneNumLen == 11) {
                int count = 0;
                for (int i = 0; i < phoneNumLen; i++) {
                    char c = phoneNum.charAt(i);
                    // 不能以 0 开头
                    if (i == 0) {
                        if ((c + "").equals("0")) {
                            System.out.println("手机号不能以 0 开头，请重新输入");
                            break;
                        }
                    }

                    if (c >= '0' && c <= '9') {
                        count++;
                    } else {
                        System.out.println("手机号必须是数字，请重新输入");
                        break;
                    }
                }

                // 跳出 while 循环
                if (count == phoneNumLen) {
                    break;
                }
            } else {
                System.out.println("手机号必须为11位");
            }
        }

        // 注册用户
        list.add(new User(username, password, sfz, phoneNum));
        System.out.println("注册用户成功");
    }

    // 忘记密码
    public static boolean forgetPassword(ArrayList<User> list, Scanner sc) {
        // 键盘录入用户名，判断当前用户名是否存在，如不存在，直接结束方法，提示：未注册该用户
        System.out.println("请输入用户名");
        String username = sc.next();
        boolean flag = false;
        User u = null;
        int idx = -1;
        for (int i = 0; i < list.size(); i++) {
            // 存在
            if (username.equals(list.get(i).getUsername())) {
                flag = true;
                u = list.get(i);
                idx = i;
                break;
            }
        }
        if (!flag) {
            System.out.println("未注册该用户");
            return false;
        }

        // 键盘录入身份证号码和手机号
        System.out.println("请输入身份证号码");
        String sfz = sc.next();
        System.out.println("请输入手机号码");
        String phoneNum = sc.next();
        // 判断当前用户的身份证号码和手机号码是否一致
        if (!u.getSfz().equals(sfz) || !u.getPhoneNumber().equals(phoneNum)) {
            System.out.println("身份证号码或手机号码输入不匹配，修改失败");
            return false;
        }

        // 一致，提示输入密码，进行修改
        System.out.println("请输入新密码");
        String password = sc.next();
        u.setPassword(password);
        list.set(idx, u);
        return true;
    }

    // 添加学生
    public static boolean addStudent(ArrayList<Student> list, Scanner sc) {
        while (true) {
            System.out.println("请输入学生 id");
            String id = sc.next();
            System.out.println("请输入学生姓名");
            String name = sc.next();
            System.out.println("请输入学生年龄");
            int age = sc.nextInt();
            System.out.println("请输入学生地址");
            String address = sc.next();

            // id 需要唯一
            boolean flag = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id)) {
                    System.out.println("学生id已重复，请重新输入");
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                list.add(new Student(id, name, age, address));
                System.out.println("学生添加成功");
                return true;
            }
        }
    }

    // 删除学生
    public static boolean deleteStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入学生 id");
        String id = sc.next();

        for (int i = 0; i < list.size(); i++) {
            // id 存在删除
            if (list.get(i).getId().equals(id)) {
                list.remove(i);
                return true;
            }
        }

        // 说明 id 不存在
        System.out.println("学生 id 不存在");
        return false;
    }

    // 修改学生
    public static boolean setStudent(ArrayList<Student> list, Scanner sc) {
        System.out.println("请输入学生 id");
        String id = sc.next();

        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            if (student.getId().equals(id)) {
                System.out.println("修改学生哪项");
                System.out.println("1: 学生姓名");
                System.out.println("2: 学生年龄");
                System.out.println("3: 学生地址");
                int num = sc.nextInt();
                if (num == 1) {
                    System.out.println("请输入学生姓名");
                    String name = sc.next();
                    student.setName(name);
                    list.set(i, student);
                } else if (num == 2) {
                    System.out.println("请输入学生年龄");
                    int age = sc.nextInt();
                    student.setAge(age);
                    list.set(i, student);
                } else if (num == 3) {
                    System.out.println("请输入学生地址");
                    String address = sc.next();
                    student.setAddress(address);
                    list.set(i, student);
                }
                return true;
            }
        }

        System.out.println("学生 id 不存在");
        return false;
    }

    // 查询学生
    public static void getStudent(ArrayList<Student> list) {
        if (list.size() == 0) {
            System.out.println("当前无学生信息，请添加学生信息");
            return;
        }

        System.out.println("id\t姓名\t年龄\t家庭住址");
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            StringJoiner sj = new StringJoiner(" ");
            System.out.println(sj.add(s.getId()).add(s.getName()).add(s.getAge() + "").add(s.getAddress()));
        }
    }

    // 退出
    public static void exit() {
        System.out.println("已退出");
    }
}

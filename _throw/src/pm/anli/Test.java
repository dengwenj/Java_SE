package pm.anli;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 需求：
        // 键盘录入自己心仪的女朋友姓名和年龄
        // 姓名的长度在 3-10之间
        // 年龄的范围为 18-40 岁
        // 超出这个范围是异常数据不能赋值，需要重新录入，一直录到正确为止
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();

        while (true) {
            try {
                System.out.println("请输入姓名");
                String name = scanner.nextLine();
                person.setName(name);
                System.out.println("请输入年龄");
                String ageStr = scanner.nextLine();
                int age = Integer.parseInt(ageStr);
                person.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄请输入数字");
            } catch (RuntimeException e) {
                System.out.println("姓名或年龄输入有误");
            }
        }
        System.out.println(person);
    }
}

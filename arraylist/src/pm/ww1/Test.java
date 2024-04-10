package pm.ww1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
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

            Scanner scanner = new Scanner(System.in);
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
                } else if (num == 2){
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

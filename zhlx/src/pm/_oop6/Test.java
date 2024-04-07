package pm._oop6;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        Student s1 = new Student(1, "朴睦", 24);
        Student s2 = new Student(2, "李雷", 18);
        //Student s3 = new Student(3, "韩梅梅", 20);

        students[0] = s1;
        students[1] = s2;
        //students[2] = s3;

        // 1、添加一个学生对象，并在添加的时候进行学号的唯一性判断
        Student student = new Student(3, "小哈哈", 20);
        // 先判断唯一性
        int id = student.getId();
        boolean flag = hasExist(students, id);

        // 学号存在
        if (flag) {
            System.out.println("该学号已存在");
            return;
        }

        // 说明学号不存在
        // 1、如果数组长度已满，创建个新数组，长度为老数组 + 1
        // 2、如果数组长度没满，直接添加进该数组
        int nullIdx = -1;
        for (int i = 0; i < students.length; i++) {
            // 说明数组没有添加满
            if (students[i] == null) {
                nullIdx = i;
                break;
            }
        }
        // nullIdx 还是等于 -1 说明一次都没进等于 null，即数组长度已满
        if (nullIdx == -1) {
            // 创建一个新的数组
            Student[] students1 = new Student[students.length + 1];
            for (int i = 0; i < students1.length; i++) {
                // 添加的新对象
                if (i == students.length) {
                    students1[i] = student;
                } else {
                    students1[i] = students[i];
                }
            }

            printArr(students1);
            System.out.println("已满");

            // 通过 id 删除学生信息, 存在删除，不存在提示
            int deleteId = 3;
            deleteStudentById(students1, deleteId);
            printArr(students1);
            System.out.println("----------");

            // 查询数字 id 为 2 的学生，如果存在，将他的年龄加1
            studentAddAgeById(students1, 2);
            printArr(students1);
        } else {
            // 数组长度未满
            students[nullIdx] = student;
            printArr(students);
            System.out.println("未满");

            // 通过 id 删除学生信息, 存在删除，不存在提示
            int deleteId = 3;
            deleteStudentById(students, deleteId);
            printArr(students);
            System.out.println("----------");

            // 查询数字 id 为 2 的学生，如果存在，将他的年龄加1
            studentAddAgeById(students, 2);
            printArr(students);
        }
    }

    // 加学生年龄
    public static void studentAddAgeById(Student[] arr, int id) {
        Student s = getStudentById(arr, id);
        if (s == null) {
            System.out.println("该学生不存在");
            return;
        }
        int newAge = s.getAge() + 1;
        s.setAge(newAge);
    }

    // 通过 id 查询该学生
    public static Student getStudentById(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }

            if (arr[i].getId() == id) {
                return arr[i];
            }
        }
        return null;
    }

    // 删除学生信息
    public static void deleteStudentById(Student[] arr, int id) {
        if (!isExistToId(arr, id)) {
            System.out.println("该学生 id 不存在");
            return;
        }
        // 通过 id 找到索引
        int idx = getIdxById(arr, id);
        arr[idx] = null;
    }

    // 通过 id 找到索引
    public static int getIdxById(Student[] arr, int id) {
        // 这里也可以定义成 -1 如果还是 -1 说明 id 不存在
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            if (arr[i].getId() == id) {
                idx = i;
            }
        }

        return idx;
    }

    // 是否存在 id
    public static boolean isExistToId(Student[] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getId() == id) {
                return true;
            }
        }
        return false;
    }

    // 打印元素
    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 等于 null 跳出本次
            if (arr[i] == null) {
                continue;
            }
            System.out.println(arr[i].getId() + " " + arr[i].getName() + " " + arr[i].getAge());
        }
    }

    public static boolean hasExist(Student[] students, int id) {
        boolean flag = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (id == students[i].getId()) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }
}

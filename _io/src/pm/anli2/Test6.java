package pm.anli2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) throws IOException {
        // 带权重的随机
        // 每次被点到的学生，再次被点到的概率在原先的基础上降低一半

        // 先把数据读入到内存中
        BufferedReader br = new BufferedReader(new FileReader("_io/src/pm/anli2/name.txt"));

        ArrayList<String> nameList = new ArrayList<>();
        String s;
        while ((s = br.readLine()) != null) {
            nameList.add(s);
        }
        br.close();

        // 然后把这些数据变成对象
        ArrayList<Student> students = new ArrayList<>();
        for (String name : nameList) {
            String[] split = name.split("-");
            students.add(new Student(
                split[0],
                split[1],
                Integer.parseInt(split[2]),
                Double.parseDouble(split[3])
            ));
        }

        // 计算出总的权重，然后就可以计算出单个的权重比
        double weight = 0;
        for (Student stu : students) {
            weight += stu.getWeight();
        }

        // 每个的权重比
        double[] arr = new double[students.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = students.get(i).getWeight() / weight;
        }

        // 计算每个的权重占比范围
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];
        }

        // 随机
        // 0-1之间
        double random = Math.random();
        // 二分查找：返回值是：-插入点 - 1
        int index = -Arrays.binarySearch(arr, random) - 1;
        // 随机到该人，把该人的概率减半
        Student stu = students.get(index);
        stu.setWeight(stu.getWeight() / 2);

        // 然后在写入到文件中
        BufferedWriter bw = new BufferedWriter(new FileWriter("_io/src/pm/anli2/name.txt"));
        for (Student student : students) {
            bw.write(student.toString());
            bw.newLine();
        }
        bw.close();
    }
}

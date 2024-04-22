package pm.ww;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 定义数组并存储一些女朋友对象，利用 Arrays 中的 sort 方法进行排序
        // 要求1：属性有姓名、年龄、身高
        // 要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
        Person p1 = new Person("pumu", 24, 171);
        Person p2 = new Person("hanmeimei", 24, 165);
        Person p3 = new Person("lilie", 20, 171);
        Person p4 = new Person("ac", 24, 171);

        Person[] arr = {p1, p2, p3, p4};

        Arrays.sort(arr, (o1, o2) -> {
            int temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

            if (temp > 0) {
                return 1;
            } else if (temp < 0) {
                return -1;
            }
            return 0;
        });

        System.out.println(Arrays.toString(arr));
    }
}

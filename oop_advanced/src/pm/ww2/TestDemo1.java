package pm.ww2;

import java.util.ArrayList;

public class TestDemo1 {
    public static void main(String[] args) {
//        System.out.println(ArrayUtil.printArr(new int[]{1, 2, 3, 4, 6, 5}));
//        System.out.println(ArrayUtil.getAerage(new double[]{1.1, 2.2, 3.3, 4.4}));

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("朴睦", 24, '男'));
        list.add(new Student("韩梅梅", 21, '女'));
        list.add(new Student("李雷", 23, '男'));

        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}

package pm.ww13;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args) {
        // 集合的遍历方式
        // 定义一个集合，添加字符串，并进行遍历
        // 遍历格式参照：[元素1, 元素2, 元素3]
        ArrayList<String> list = new ArrayList<>();

        list.add("你好");
        list.add("世界");
        list.add("朴睦");

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print("]");
    }
}

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list, "朴睦", "李雷", "王阳明");

        System.out.println(list); // [朴睦, 李雷, 王阳明]

        ArrayList<Integer> list1 = new ArrayList<>();
        ListUtil.addAll2(list1, 1, 2, 3, 4, 5, 6);
        System.out.println(list1); // [1, 2, 3, 4, 5, 6]
    }
}

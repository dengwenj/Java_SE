import java.util.ArrayList;

public class ListUtil {
    private ListUtil() {}

    // 用来添加多个集合的元素
    // 泛型方法定义写在修饰符的后面
    public static<E> void addAll(ArrayList<E> list, E e1, E e2, E e3) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
    }

    public static<E> void addAll2(ArrayList<E> list, E ...es) {
        for (E e : es) {
            list.add(e);
        }
    }
}

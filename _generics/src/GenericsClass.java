import java.util.Arrays;

public class GenericsClass<E> {
    // 长度为 10 的数组
    private Object[] obj = new Object[10];
    private int size;

    // E 表示不确定的类型，该类型在类名后面已经定义过了
    public boolean add(E e) {
        obj[size++] = e;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}

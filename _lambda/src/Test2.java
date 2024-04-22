import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        method(arr -> {
            Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        });
    }

    public static void method(StrSort strSort) {
        String[] arr = {"aa", "bbbbbbb", "c", "dd"};
        strSort.ss(arr);
        System.out.println(Arrays.toString(arr));
    }
}

@FunctionalInterface
interface StrSort {
    void ss(String[] strings);
}

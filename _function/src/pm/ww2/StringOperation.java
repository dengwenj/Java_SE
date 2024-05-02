package pm.ww2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperation extends StringF {

    public StringOperation() {
        method();
        method3();
    }

    public void method() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "朴睦", "王阳明", "王小波", "张银河");

        List<String> list1 = list.stream()
            .filter(this::stringJudge)
            .toList();
        System.out.println("list1：" + list1);

        boolean e2 = isE2(list, "朴睦", super::isExist);
        System.out.println(e2);
    }

    public <T> boolean isE2(ArrayList<T> list, T item, MyFunction fn) {
        return fn.callback(list, item);
    }

    public boolean stringJudge(String s) {
        return s.startsWith("张") && s.length() == 3;
    }

    public String method2(W w) {
        return w.test();
    }

    public void method3() {
        String s = method2(this::method4);
        System.out.println(s);
    }

    public String method4() {
      return "method4";
    }
}

@FunctionalInterface
interface W {
    String test();
}

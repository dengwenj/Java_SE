package pm.ww;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Loop2 {
    public static void main(String[] args) {
        // 增强 for
        Collection<String> coll = new ArrayList<>();
        coll.add("朴睦");
        coll.add("李雷");
        coll.add("韩梅梅");
        // s 就是个变量，每次会把集合里面的元素赋给 s
        for (String s : coll) {
            System.out.println(s);
        }

        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        coll.forEach((s) -> {
            System.out.println(s);
        });
    }
}

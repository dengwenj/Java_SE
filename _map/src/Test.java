import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // put 方法的细节
        // 添加、覆盖
        // 在添加数据的时候，如果键不存在，那么直接把键值对对象添加到 map 集合当中，方法返回 null
        // 在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回
        map.put("name", "朴睦");
        map.put("王小波", "李银河");
        map.put("hello", "world");
        String put = map.put("name", "dengwj");
        System.out.println(put); // 朴睦

        // remove 根据键删除键值对元素
        String remove = map.remove("hello");
        System.out.println(remove); // world

        // 移除所有的键值对元素
        // map.clear();

        // 判断集合是否包含指定的键
        boolean isKey = map.containsKey("name");
        System.out.println(isKey); // true

        // 判断集合是否包含指定的值
        boolean isValue = map.containsValue("李银河");
        System.out.println(isValue); // true

        // 判断结婚是否为空
        boolean empty = map.isEmpty();
        System.out.println(empty); // false

        // 集合的长度
        System.out.println(map.size()); // 2

        System.out.println(map); // {王小波=李银河, name=dengwj}
    }
}

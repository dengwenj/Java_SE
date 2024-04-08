package pm.ww1;

public class Demo11 {
    public static void main(String[] args) {
        String str = "你好世界，敏感词替换";

        String newStr = str.replace("敏感词", "哈哈哈");

        System.out.println(str);
        System.out.println(newStr);

        String talk = "我是朴睦，我没有说脏话1，没有说脏话2";
        String[] arr = {"脏话1", "脏话2", "脏话3", "脏话4"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i], "***");
        }
        System.out.println(talk);
    }
}

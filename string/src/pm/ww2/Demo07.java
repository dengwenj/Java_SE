package pm.ww2;

public class Demo07 {
    public static void main(String[] args) {
        // 调整字符串
        // 给定两个字符串 A 和 B
        // A 的旋转操作就是将 A 最左边的字符移动到最右边
        // 例如：若 A = "abcde"，在移动一次之后结果就是 "bcdea"
        // 如果在若干次调整操作之后，A 能变成 B，那么返回 true，反之

        String a = "abcde";
        String b = "cdeab";

        // String str = move(a, 12);
        // System.out.println(str);
        // System.out.println(str.equals(b));
        System.out.println(move(a, b));
    }

    public static boolean move(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(0);
            String str = str1.substring(1);
            str1 = str + c;
            System.out.println(str1);
            if (str1.equals(str2)) {
                return true;
            }
        }
        return false;
    }

//    public static String move(String str, int num) {
//        // 移动多少次
//        int moveNum = num % str.length();
//        System.out.println(moveNum);
//
//        if (moveNum <= 0) {
//            return str;
//        }
//
//        // 截取要移动的几个
//        String sub = str.substring(0, moveNum);
//        StringBuilder sb = new StringBuilder(str.substring(moveNum));
//
//        // 把第一个放入最后一个
//        // 移动多少次
//        for (int i = 0; i < moveNum; i++) {
//            sb.append(sub.charAt(i));
//        }
//
//        return sb.toString();
//    }
}

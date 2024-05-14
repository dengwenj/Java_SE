package pm.ww;

public class StringUtil {
    public static void printName(String name) {
        if (name == null) {
            System.out.println(0);
            return;
        }

        System.out.println(name.length());
    }

    public static int strMaxIndex(String str) {
        if (str == null) {
            return -1;
        }
        return str.length() - 1;
    }
}

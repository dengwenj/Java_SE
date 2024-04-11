package pm.ww1;

public class Demo01 {
    public static void main(String[] args) {
        char[] chars = new char[52];
        for (int i = 0; i < chars.length; i++) {
            if (i < 26) {
                chars[i] = (char) (65 + i);
            } else {
                chars[i] = (char) (97 + i - 26);
            }
        }
        System.out.println(chars);
    }
}

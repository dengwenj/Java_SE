package pm._copyfile;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // java 中编码的方法
        String str = "ni好啊";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes)); // [110, 105, -27, -91, -67, -27, -107, -118]

        String str1 = "shi界啊";
        byte[] gbks = str1.getBytes("GBK");
        System.out.println(Arrays.toString(gbks)); // [115, 104, 105, -67, -25, -80, -95]

        // 解码
        String str2 = new String(bytes);
        System.out.println(str2); // ni好啊
        String str3 = new String(gbks, "GBK");
        System.out.println(str3); // shi界啊
    }
}

package pm.ww2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        prop.setProperty("admin", "123456");
        prop.setProperty("test", "123456");
        prop.setProperty("prod", "123456");

        // 写入文件
        prop.store(new FileWriter("_properties-xml-log/user2.properties"), "test");
    }
}

package pm.ww;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();

        // 读取属性文件中的数据
        // 先加载
        prop.load(new FileReader("_properties-xml-log/user.properties"));

        String pm = prop.getProperty("朴睦");
        System.out.println(pm);

        Set<String> keys = prop.stringPropertyNames();
        System.out.println(keys); // [李雷, 朴睦, 韩梅梅]

        System.out.println(prop.containsKey("李雷"));
    }
}

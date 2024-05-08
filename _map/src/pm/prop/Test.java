package pm.prop;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        // Properties，写入到配置文件 store，读取配置文件 load
        Properties prop = new Properties();

        prop.put("朴睦", "24");
        prop.put("李雷", "20");
        prop.put("韩梅梅", "18");
        prop.put("她", "20");
        System.out.println(prop);

        // 写入到 properties 后缀文件
        FileWriter fw = new FileWriter("_map/src/pm/prop/test.properties");

        prop.store(fw, "test config file");
        fw.close();

        // 读取
        FileReader fr = new FileReader("_map/src/pm/prop/test.properties");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }
}

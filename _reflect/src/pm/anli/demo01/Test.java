package pm.anli.demo01;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IOException {
        // 对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中
        Student stu = new Student("朴睦", 24, '男', 1.73, "敲代码");
        reflectInfo("pm.anli.demo01.Student", stu);
    }

    public static void reflectInfo(String forName, Object stu) throws ClassNotFoundException, IllegalAccessException, IOException {
        // 获取 Student class 字节码对象
        Class<?> clazz = Class.forName(forName);

        // 获取所有字段
        Field[] fields = clazz.getDeclaredFields();

        Properties prop = new Properties();
        for (Field field : fields) {
            // 获取名字
            String fieldName = field.getName();

            field.setAccessible(true);
            Object val = field.get(stu);
            if (val == null) {
                val = "null";
            }
            prop.setProperty(fieldName, val.toString());
        }

        prop.store(new FileWriter("_reflect/src/pm/anli/demo01/reflect.properties"), "reflectInfo");
    }

}

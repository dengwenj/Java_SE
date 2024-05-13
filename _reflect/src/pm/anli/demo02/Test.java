package pm.anli.demo02;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
        Properties prop = new Properties();

        FileReader fw = new FileReader("_reflect/src/pm/anli/demo02/conf.properties");
        prop.load(fw);

        String method = prop.getProperty("method");
        String aClass = prop.getProperty("class");

        Class<?> clazz = Class.forName(aClass);

        // 创建对象
        Constructor<?> constructor = clazz.getConstructor();
        constructor.setAccessible(true);
        Object o = constructor.newInstance();
        System.out.println(o);

        // 调用方法
        Method declaredMethod = clazz.getDeclaredMethod(method);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(o);
    }
}

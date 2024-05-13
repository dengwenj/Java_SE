package pm.ww;

import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {
    public static Star createProxy(BigStar bigStar) {
        Star star = (Star) Proxy.newProxyInstance(
            ProxyUtil.class.getClassLoader(),
            new Class[]{Star.class},
            // 匿名内部类，可以写成 lambda 表达式
            (proxy, method, args) -> {
                /**
                 * 参数一：代理的对象
                 * 参数二：要运行的方法
                 * 参数三：调用方法时，传递的参数
                 */
                System.out.println("------------------------");
                System.out.println("就是先拦截下来做一些事情");
                System.out.println("method = " + method);
                System.out.println("args = " + Arrays.toString(args));

                if (method.getName().equals("eat")) {
                    System.out.println("先准备碗筷");
                } else if ("run".equals(method.getName())) {
                    System.out.println("先准备运动");
                }
                return method.invoke(bigStar, args);
            }
        );

        return star;
    }
}

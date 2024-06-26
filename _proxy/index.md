## 什么是动态代理？
* 无侵入式的给代码增加额外的功能
* 调用者 -> 代理 -> 对象
* 就是先拦截下来做一些事情

## 程序为什么需要代理，代理长什么样
* 对象如果嫌身上干的事太多的话，可以通过代理来转移部分职责
* 对象有什么方法想被代理，代理就一定要有对应的方法

## 代理长什么样？
* 代理里面就是对象要被代理的方法

## java 通过什么来保证代理的样子？
* 通过接口保证，后面的对象和前面的代理需要实现同一个接口
* 接口中就是被代理的所有方法

## 如何为 java 对象创建一个代理对象
* java.lang.reflect.Proxy 类：提供了为对象产生代理对象的方法
* public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
* 参数一：用于指定用哪个类加载器，去加载生成的代理类
* 参数二：指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
* 参数三：用来指定生成的代理对象要干什么事情
```java
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
```
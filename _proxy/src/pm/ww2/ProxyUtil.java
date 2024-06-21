package pm.ww2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star crateProxy(Star star) {
        return (Star) Proxy.newProxyInstance(
            ProxyUtil.class.getClassLoader(),
            new Class[]{Star.class},
            new InvocationHandler() {
                @Override
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    // args 传的参数
                    if (method.getName().equals("sing")) {
                        System.out.println("准备场地唱歌了");
                    } else if (method.getName().equals("dance")) {
                        System.out.println("准备场地跳舞了");
                    }
                    return method.invoke(star, args);
                }
            }
        );
    }
}

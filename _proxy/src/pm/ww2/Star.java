package pm.ww2;

// 通过接口保证，后面的对象和前面的代理需要实现同一个接口
public interface Star {
    String sing(String name);

    void dance(String name);
}

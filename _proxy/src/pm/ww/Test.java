package pm.ww;

public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("朴睦");
        Star proxy = ProxyUtil.createProxy(bigStar);

        String eat = proxy.eat("吃饭"); // 这个参数是传给 newProxyInstance 第三个参数的第三个参数，即 args 参数
        System.out.println(eat);

        proxy.run();
    }
}

package pm.ww;

public class Test {
    public static void main(String[] args) {
        BigStar bigStar = new BigStar("朴睦");
        Star proxy = ProxyUtil.createProxy(bigStar);

        String eat = proxy.eat("吃饭");
        System.out.println(eat);

        proxy.run();
    }
}

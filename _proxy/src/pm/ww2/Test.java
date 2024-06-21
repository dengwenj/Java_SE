package pm.ww2;

public class Test {
    public static void main(String[] args) {
        Star s = new BigStar("朴睦");
        Star star = ProxyUtil.crateProxy(s);

        String val = star.sing("船长");
        System.out.println(val);

        star.dance("拉丁舞");
    }
}

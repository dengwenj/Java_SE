package pm.ww5;

public class Test {
    public static void main(String[] args) {
        // 利用方法的重写设计继承结构
        HSQ hsq = new HSQ();
        hsq.eat();
        hsq.heShui();
        hsq.home();
        hsq.cJ();
        System.out.println("-----------");
        SPG spg = new SPG();
        spg.eat();
        spg.heShui();
        spg.home();
        System.out.println("-----------");
        ChinaDog chinaDog = new ChinaDog();
        chinaDog.eat();
        chinaDog.heShui();
        chinaDog.home();
    }
}

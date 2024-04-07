package pm._oop;

public class Test {
    public static void main(String[] args) {
        GameRole ga1 = new GameRole("乔峰", 100, '男');
        GameRole ga2 = new GameRole("鸠摩智", 100, '男');

        ga1.showInfo();
        ga2.showInfo();

        while (true) {
            ga1.play(ga2);
            if (ga2.getXl() <= 0) {
                System.out.println(ga1.getName() + "KO了" + ga2.getName());
                break;
            }

            ga2.play(ga1);
            if (ga1.getXl() <= 0) {
                System.out.println(ga2.getName() + "KO了" + ga1.getName());
                break;
            }
        }
    }
}

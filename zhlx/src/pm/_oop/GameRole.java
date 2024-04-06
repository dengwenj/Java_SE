package pm._oop;

import java.util.Random;

public class GameRole {
    // 姓名
    private String name;
    // 血量🩸
    private double xl;

    public GameRole() {

    }

    public GameRole(String name, int xl) {
        setName(name);
        setXl(xl);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setXl(double xl) {
        this.xl = xl;
    }

    public double getXl() {
        return xl;
    }

    public void play(GameRole gr) {
        // harm 也可以随机生成 1 - 20 Random
        Random r = new Random();
        int harm = r.nextInt(20) + 1;

        // 剩余血量
        double laveXl = gr.getXl() - harm;
        laveXl = laveXl < 0 ? 0 : laveXl;
        gr.setXl(laveXl);

        System.out.println(
            this.getName()
                + "举起石头打了"
                + gr.getName()
                + "一下，造成了"
                + harm + "点伤害，"
                + gr.getName()
                + "还剩下"
                + gr.getXl()
                + "点血"
        );
    }
}

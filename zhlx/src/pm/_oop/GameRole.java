package pm._oop;

import java.util.Random;

public class GameRole {
    // 姓名
    private String name;
    // 血量🩸
    private double xl;
    // 性别
    private char sex;
    // 长相
    private String face;

    String[] boyface = {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlface = {"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    String[] attackDesc = {
        "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
        "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
        "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
        "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
        "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
        "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    String[] injuredDesc = {
        "结果%s退了半步，毫发无损",
        "结果给%s造成一处瘀伤",
        "结果一击命中，%s痛得弯下腰",
        "结果%s痛苦地闷哼了一声，显然受了点内伤",
        "结果%s摇摇晃晃，一跤摔倒在地",
        "结果%s脸色一下变得惨白，连退了好几步",
        "结果『轰』的一声，%s口中鲜血狂喷而出",
        "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public GameRole() {

    }

    public GameRole(String name, int xl, char sex) {
        setName(name);
        setXl(xl);
        this.sex = sex;
        setFace(sex);
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }

    public void setFace(char sex) {
        String f = "面目狰狞";

        Random r = new Random();
        if (sex == '男') {
            int idx = r.nextInt(boyface.length);
            f = boyface[idx];
        } else if (sex == '女') {
            int idx = r.nextInt(girlface.length);
            f = girlface[idx];
        }

        this.face = f;
    }

    public String getFace() {
        return this.face;
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

    public void showInfo() {
        System.out.println(getName());
        System.out.println(getSex());
        System.out.println(getXl());
        System.out.println(getFace());
    }

    public void play(GameRole gr) {
        // harm 也可以随机生成 1 - 20 Random
        Random r = new Random();
        int idx = r.nextInt(attackDesc.length);

        int harm = r.nextInt(20) + 1;

        // %s 占位符
        System.out.printf(attackDesc[idx], getName(), gr.getName());
        System.out.println();

        // 剩余血量
        double laveXl = gr.getXl() - harm;
        laveXl = laveXl < 0 ? 0 : laveXl;
        gr.setXl(laveXl);

        // 血量
        // 90-100
        // 80-90
        // 70-80
        // 60-70
        // 50-60
        // 30-50
        // 10-30
        // 0-10
        if (laveXl > 90) {
            System.out.printf(injuredDesc[0], gr.getName());
        } else if (laveXl > 80 && laveXl <= 90) {
            System.out.printf(injuredDesc[1], gr.getName());
        } else if (laveXl > 70 && laveXl <= 80) {
            System.out.printf(injuredDesc[2], gr.getName());
        } else if (laveXl > 60 && laveXl <= 70) {
            System.out.printf(injuredDesc[3], gr.getName());
        } else if (laveXl > 50 && laveXl <= 60) {
            System.out.printf(injuredDesc[4], gr.getName());
        } else if (laveXl > 30 && laveXl <= 50) {
            System.out.printf(injuredDesc[5], gr.getName());
        } else if (laveXl > 20 && laveXl <= 30) {
            System.out.printf(injuredDesc[6], gr.getName());
        } else {
            System.out.printf(injuredDesc[7], gr.getName());
        }
        System.out.println();
    }
}

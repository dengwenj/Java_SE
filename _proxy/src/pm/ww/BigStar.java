package pm.ww;

public class BigStar implements Star {
    private String name;

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "BigStar{name = " + name + "}";
    }

    @Override
    public String eat(String name) {
        System.out.println(this.name + "吃饭" + name);
        return "吃饱了";
    }

    @Override
    public void run() {
        System.out.println(this.name + "跑步");
    }
}

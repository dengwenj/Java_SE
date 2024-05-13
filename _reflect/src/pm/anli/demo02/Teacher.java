package pm.anli.demo02;

public class Teacher {
    private String zw;

    public Teacher() {
    }

    public Teacher(String zw) {
        this.zw = zw;
    }

    /**
     * 获取
     * @return zw
     */
    public String getZw() {
        return zw;
    }

    /**
     * 设置
     * @param zw
     */
    public void setZw(String zw) {
        this.zw = zw;
    }

    public void run() {
        System.out.println("老师在跑步");
    }

    public String toString() {
        return "Teacher{zw = " + zw + "}";
    }
}

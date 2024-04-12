package pm.ww7;

public abstract class YG {
    private String gh;
    private String name;
    private double gz;

    public YG() {

    }

    public YG(String gh, String name, double gz) {
        this.gh = gh;
        this.name = name;
        this.gz = gz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGh(String gh) {
        this.gh = gh;
    }

    public void setGz(double gz) {
        this.gz = gz;
    }

    public String getName() {
        return name;
    }

    public double getGz() {
        return gz;
    }

    public String getGh() {
        return gh;
    }

    public void work() {
        System.out.println("员工在工作");
    }

    public void eat() {
        System.out.println("吃米饭");
    }
}

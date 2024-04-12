package pm.ww7;

public class JL extends YG {
    private double gljj;

    public JL() {

    }

    public JL(String gh, String name, double gz, double gljj) {
        super(gh, name, gz);
        this.gljj = gljj;
    }

    public void setGljj(double gljj) {
        this.gljj = gljj;
    }

    public double getGljj() {
        return gljj;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }
}

package vip.dengwj._enum;

public enum WW {
    X,
    Y,
    Z;

    private WW() {}

    private WW(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

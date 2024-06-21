package vip.dengwj._enum;

// 抽象枚举
public enum AWW {
    X("朴睦") {
        @Override
        public void method() {
            System.out.println(this.getName() + "在写代码");
        }
    },
    Y("李雷") {
        @Override
        public void method() {
            System.out.println(this.getName() + "在跑步");
        }
    },
    Z("韩梅梅") {
        @Override
        public void method() {
           System.out.println(getName() + "在吃饭");
        }
    };

    AWW(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void method();
}

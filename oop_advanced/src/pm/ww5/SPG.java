package pm.ww5;

public class SPG extends Dog {
    // 重写吃饭方法
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃狗粮、吃骨头");
    }
}

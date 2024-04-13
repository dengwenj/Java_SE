package pm.ww9;

public class Admin extends Person {
    @Override
    public void show() {
        System.out.println("管理员:" + this.getName() + this.getAge());
    }
}

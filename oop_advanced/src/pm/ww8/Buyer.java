package pm.ww8;

// 采购人员
public class Buyer extends AdminStaff {
    public Buyer() {

    }

    public Buyer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {// 在虚方法表里
        System.out.println("我是采购人员，我在工作");
    }
}

package pm.ww8;

// 维护人员
public class Maintainer extends AdminStaff {
    public Maintainer() {

    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("我是维护人员，我在工作");
    }
}

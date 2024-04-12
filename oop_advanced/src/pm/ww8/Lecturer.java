package pm.ww8;

// 讲师
public class Lecturer extends Teacher {
    public Lecturer() {

    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("我是讲师，讲课时我的工作");
    }
}

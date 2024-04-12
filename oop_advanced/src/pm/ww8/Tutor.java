package pm.ww8;

// 助教
public class Tutor extends Teacher {
    public Tutor() {

    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("我是助教，这是我的工作");
    }
}

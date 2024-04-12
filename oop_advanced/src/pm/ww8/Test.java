package pm.ww8;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("0001", "老师");
        System.out.println(l.getId());
        System.out.println(l.getName());
        l.work();
        System.out.println("----------");

        Tutor t = new Tutor("0002", "助教");
        System.out.println(t.getId());
        System.out.println(t.getName());
        t.work();
        System.out.println("----------");

        Maintainer m = new Maintainer("0003", "维护人员");
        System.out.println(m.getId());
        System.out.println(m.getName());
        m.work();
        System.out.println("----------");

        Buyer b = new Buyer("0004", "采购人员");
        System.out.println(b.getId());
        System.out.println(b.getName());
        b.work();
        System.out.println("----------");
    }
}

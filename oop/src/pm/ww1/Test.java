package pm.ww1;

public class Test {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("朴睦");
        System.out.println(p.getName());

        p.setAge(-24);
        System.out.println(p.getAge());

        p.setSex("男");
        System.out.println(p.getSex());
    }
}

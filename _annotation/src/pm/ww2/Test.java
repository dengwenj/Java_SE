package pm.ww2;

@MyTest1("元注解")
public class Test {
    // @MyTest1(""), 不行
    private String name;

    @MyTest1("ww")
    public void test1() {
        System.out.println("test1");
    }
}

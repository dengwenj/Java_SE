package pm.ww14;

public class Test {
    public static void main(String[] args) {
        {
            System.out.println("局部代码块");
        }

        Person p = new Person();

        Person p1 = new Person("朴睦", 24);
    }
}

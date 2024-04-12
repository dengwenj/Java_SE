package pm.ww7;

public class Test {
    public static void main(String[] args) {
        JL jl = new JL("0001", "朴睦", 20000.00, 10000.00);
        System.out.println(jl.getGh());
        System.out.println(jl.getName());
        System.out.println(jl.getGz());
        System.out.println(jl.getGljj());
        jl.work();
        jl.eat();
        System.out.println("------------");
        CS cs = new CS("0002", "李雷", 10000.00);
        System.out.println(cs.getGh());
        System.out.println(cs.getName());
        System.out.println(cs.getGz());
        cs.work();
        cs.eat();
    }
}

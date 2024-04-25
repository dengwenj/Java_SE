public class Test {
    public static void main(String[] args) {
        GenericsClass<String> list = new GenericsClass<>();

        list.add("朴睦");
        list.add("韩梅梅");
        list.add("李雷");

        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list);
    }
}

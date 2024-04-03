package pm.operator;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(1 + 1);
        System.out.println(2 - 1);
        System.out.println(2 * 2);

        // 小数参与计算可以是不精确的
        // 整数相除只能是整数
        // 除法
        System.out.println(10 / 3); // 3
        System.out.println(10.0 / 3); // 3.3333333335

        System.out.println(10 % 3); // 1
        System.out.println(9 % 3); // 0
        System.out.println(8 % 3); // 2
        System.out.println("");
    }
}

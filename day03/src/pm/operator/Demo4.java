package pm.operator;

public class Demo4 {
    public static void main(String[] args) {
        // 赋值运算符
        int num1 = 10;
        int num2 = 20;
        // num1 = (int)(num1 + num2) 底层会做强制转换
        num1 += num2;
        System.out.println(num1);

        short num3 = 30;
        // short 类型会先转成 int 类型
        // num3 = (short)(num3 + num2)
        num3 += num2;
        System.out.println(num3);

        System.out.println(num1 == num2); // false
    }
}

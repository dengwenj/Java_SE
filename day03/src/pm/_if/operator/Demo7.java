package pm._if.operator;

public class Demo7 {
    public static void main(String[] args) {
        // 三元表达式
        // 作用：可以进行判断，根据判断的结果得到不同的内容
        // 格式：关系表达式 ? 表达式1 : 表达式2

        int num1 = 10;
        int num2 = 20;
        int max = num1 > num2 ? num1 : num2;
        System.out.println(max); // 20
    }
}

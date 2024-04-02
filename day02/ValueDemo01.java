public class ValueDemo01 {
  public static void main(String[] args) {
    // 整数字面量
    System.out.println(999);
    System.out.println(-111);

    // 小数字面量
    System.out.println(3.14);
    System.out.println(-3.14);

    // 字符串字面量
    System.out.println("Hello");

    // 字符字面量(单引号，只能有一个)
    System.out.println('A');

    // 布尔字面量
    System.out.println(true);
    System.out.println(false);

    // 空字面量
    System.out.println("null");

    //  \t 制表符
    // 在打印的时候，把前面字符串的长度补齐到 8，或者 8 的整数倍。最少补 1 个空格，最多补 8 个空格
    System.out.println("Hello\tWorld");
    System.out.println("tom" + '\t' + "24");
  }
}
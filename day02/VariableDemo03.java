import java.util.Scanner;

public class VariableDemo03 {
  public static void main(String[] args) {
    // 键盘录入
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入数字");

    int i = sc.nextInt();

    System.out.println(i);

    System.out.println("这次相加，请输入第一个数");
    int num1 = sc.nextInt();
    System.out.println("请输入等二个数");
    int num2 = sc.nextInt();
    System.out.println(num1 + num2);
  }
}

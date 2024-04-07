package pm._oop3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 键盘录入：
        // 第一套体系
        // nextInt() 接收整数
        // nextDouble() 接收小数
        // next() 接收字符串
        // 遇到空格，制表符，回车就停止接受，这些符号后面的数据就不会接受了

        // 第二套体系
        // nextLine() 接收字符串
        // 可以接收空格、制表符，遇到回车才停止接收数据

        Car[] carArr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < carArr.length; i++) {
            Car c = new Car();

            System.out.println("请输入品牌");
            String str = sc.next();
            c.setBrand(str);

            System.out.println("请输入价格");
            int num = sc.nextInt();
            c.setPrice(num);

            System.out.println("请输入颜色");
            String str1 = sc.next();
            c.setColor(str1);

            carArr[i] = c;
        }

        for (int i = 0; i < carArr.length; i++) {
            System.out.println(carArr[i].getBrand() + " " + carArr[i].getPrice() + " " + carArr[i].getColor());
        }
    }
}

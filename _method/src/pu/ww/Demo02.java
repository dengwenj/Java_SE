package pu.ww;

public class Demo02 {
    public static void main(String[] args) {
        // 形参和实参
        // 形参：全称形式参数，是指方法定义中的参数
        // 实参：全称实际参数，方法调用中的参数
        method1(11.1, 22.2);
        method2(3.1);
        int[] arr = {1, 2, 3, 4};
        method3(arr);
    }

    public static void method1(double width, double height) {
        double res = (width + height) * 2;
        System.out.println("res: " + res);
    }

    public static void method2(double radius) {
        double res = radius * radius * 3.14;
        System.out.println("res:" + res);
    }

    public static void method3(int[] arr) {
        System.out.println(arr.length);
    }
}

package pu.ww;

public class Demo01 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        System.out.println("我是一个方法");

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length];
        System.out.println(arr[0]);
        System.out.println(arr1.length);
    }
}

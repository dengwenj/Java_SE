package pm.ww1;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[10]);
            // 此处出现了异常，程序就会在这里创建一个 ArrayIndexOutOfBoundsException 对象
            // new ArrayIndexOutOfBoundsException()
            // 拿着这个对象到 catch 的小括号中对比，看括号中的变量是否可以接收这个对象
            // 如果能被接收，就表示该异常就被捕获，执行 catch 里面对应的代码
            // 当 catch 里面所有的代码执行完毕，继续执行 try...catch 体系下面的其他代码
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        System.out.println("我执行了吗？");
    }
}

package pm.ww1;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[10]);
            System.out.println(2 / 0);
            String str = null;
            System.out.println(str.equals("str"));
            System.out.println("try后面");
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("出错");
        }
        //catch (NullPointerException e) {
            //System.out.println("空指针");
        //}
        catch (Exception e) {
            System.out.println("父类");
        }
        System.out.println("下面执行了吗");
    }
}

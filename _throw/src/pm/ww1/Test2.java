package pm.ww1;

public class Test2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        System.out.println("我进了吗");
    }
}

package pm.ww;

public class Test2 {
    public static void main(String[] args) {
        // 不死神兔
        // 从第三个数据开始，是前两个数据和（菲波那切数列）
        int count = bsst(12);
        System.out.println(count); // 144
    }
 
    public static int bsst(int month) {
        if (month <= 2) {
            return 1;
        }

        return bsst(month - 2) + bsst(month - 1);
    }
}

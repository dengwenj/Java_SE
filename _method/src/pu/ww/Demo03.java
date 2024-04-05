package pu.ww;

public class Demo03 {
    public static void main(String[] args) {
        // 格式
        /*public static 返回值类型 方法名(参数) {
            方法体;
            return 返回值;
        }*/
        double res1 = getArea(3.1, 3.2);
        double res2 = getArea(2.1, 2.2);

        if (res1 > res2) {
            System.out.println("第一个长方形面积大");
        } else if (res1 < res2) {
            System.out.println("第二个长方形面积大");
        } else  {
            System.out.println("一样大");
        }
    }

    // 计算长方形的面积
    public static double getArea(double width, double height) {
        return width * height;
    }
}

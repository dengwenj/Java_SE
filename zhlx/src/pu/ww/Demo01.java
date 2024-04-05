package pu.ww;

public class Demo01 {
    public static void main(String[] args) {
        // 买飞机票
        double price = 2000.0;
        int month = 10;
        String position = "头等舱";

        switch (month) {
            case 5, 6, 7, 8, 9, 10 -> {
                price = priceM(price, position, 0.9, 0.85);
            }
            case 11, 12, 1, 2, 3, 4 -> {
                price = priceM(price, position, 0.7, 0.65);
            }
            default -> System.out.println("月份不合法");
        }
        System.out.println("最终价格：" + price);
    }

    public static double priceM(double price, String position, double tzk, double jzk) {
        if (position == "头等舱") {
            price *= tzk;
        } else if (position == "经济舱") {
            price *= jzk;
        } else {
            System.out.println("没有这个仓位");
        }
        return price;
    }
}

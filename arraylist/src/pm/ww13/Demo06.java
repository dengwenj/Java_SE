package pm.ww13;

import java.util.ArrayList;

public class Demo06 {
    public static void main(String[] args) {
        // 添加手机对象并返回要求的数据
        // 定义 Phone 类
        // main 方法中定义一个集合，存入三个手机对象
        // 分别是：小米 1000，苹果 8000，华为 6000
        // 定义一个方法，将价格低于 3000 元的手机信息返回
        ArrayList<Phone> list = new ArrayList<>();

        list.add(new Phone("小米", 1000));
        list.add(new Phone("苹果", 8000));
        list.add(new Phone("华为", 6000));

        ArrayList<Phone> phoneByPrice = getPhoneByPrice(3000, list);
        System.out.println(phoneByPrice);

        System.out.println(list.get(0).getBrand()); // 小米
        System.out.println(phoneByPrice.get(0).getBrand()); // 小米

        phoneByPrice.get(0).setBrand("su7");

        System.out.println(list.get(0).getBrand()); // su7
        System.out.println(phoneByPrice.get(0).getBrand()); // su7
    }

    public static ArrayList<Phone> getPhoneByPrice(double price, ArrayList<Phone> list) {
        ArrayList<Phone> phones = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < price) {
                phones.add(list.get(i));
            }
        }

        return phones;
    }
}

package pm._oop2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Goods[] goodsArr = new Goods[3];

        Goods g1 = new Goods("衣服", 121.99, 300);
        Goods g2 = new Goods("裤子", 99.98, 200);
        Goods g3 = new Goods("鞋子", 189.00, 100);

        goodsArr[0] = g1;
        goodsArr[1] = g2;
        goodsArr[2] = g3;

        System.out.println(Arrays.toString(goodsArr));
        System.out.println(goodsArr[0].getName());

        for (int i = 0; i < goodsArr.length; i++) {
            System.out.println(goodsArr[i].getId() + " " + goodsArr[i].getName() + " " + goodsArr[i].getPrice() + " " + goodsArr[i].getStorage());
        }
    }
}

package pm._oop4;

public class Test {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];

        Phone p1 = new Phone("华为", 5999, "黑色");
        Phone p2 = new Phone("小米", 3999, "灰色");
        Phone p3 = new Phone("苹果", 6999, "白色");

        phones[0] = p1;
        phones[1] = p2;
        phones[2] = p3;

        int sum = 0;
        for (int i = 0; i < phones.length; i++) {
            sum += phones[i].getPrice();
        }

        double svg = (double) sum / phones.length;
        System.out.println("平均价格为：" + svg);
    }
}

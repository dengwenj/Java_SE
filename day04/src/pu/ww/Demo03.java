package pu.ww;

public class Demo03 {
    public static void main(String[] args) {
        /*初始化语句;
        while(条件判断语句) {
            循环体语句;
            条件控制语句;
        }*/
        // while 循环
        int num = 1;
        while(num <= 10) {
            System.out.println(num);
            num++;
        }

        int count = 0;
        double mm = 0.1;
        double height = 8844430;
//        while(true) {
//            if (mm >= height) {
//                break;
//            } else {
//                mm *= 2;
//                count += 1;
//            }
//        }
//        System.out.println("折叠了" + count + "次");


        while(mm < height) {
            mm *= 2;
            count++;
        }
        System.out.println(count);
    }
}

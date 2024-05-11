package pm._enum;

public class Demo02 {
    public static void main(String[] args) {
        // 使用常量
        // method(Constant1.BOY);

        // 使用枚举
        method(Constant2.BOY);
    }

    public static void method(Constant2 sex) {
        switch (sex) {
            case BOY:
                System.out.println("男");
                break;
            case GIRL:
                System.out.println("女");
                break;
            default:
                System.out.println("没有");
                break;
        }
    }

//    public static void method(int sex) {
//        switch (sex) {
//            case Constant1.BOY:
//                System.out.println("男");
//                break;
//            case Constant1.GIRL:
//                System.out.println("女");
//                break;
//            default:
//                System.out.println("没有");
//                break;
//        }
//    }
}

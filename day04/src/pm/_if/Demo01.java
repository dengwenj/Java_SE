package pm._if;

public class Demo01 {
    public static void main(String[] args) {
//        if (关系表达式) {
//           语句体;
//        }

        int num = 1;
        if (num == 1) {
            System.out.println("我进来了");
        } else if (num == 2) {
            System.out.println("我进 if else 了");
        } else {
            System.out.println("我进 else 了");
        }
    }
}

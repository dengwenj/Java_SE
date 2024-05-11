package pm._enum;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Test a = Test.A;
        Test test = Test.valueOf("A");
        System.out.println(test);

        Test[] values = Test.values();
        System.out.println(Arrays.toString(values));
    }
}

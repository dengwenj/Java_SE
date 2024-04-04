package pm._if.operator;

public class Demo05 {
    public static void main(String[] args) {
        // 逻辑运算符
        System.out.println(false & true); // false
        System.out.println(true & true); // true
        System.out.println(true & false); // false

        System.out.println(false | true); // true
        System.out.println(true | false); // true
        System.out.println(false | false); // false
        System.out.println(true | true); // true

        System.out.println(false ^ false); // false
        System.out.println(true ^ true); // false
        System.out.println(false ^ true); // true

        System.out.println(!false); // true
        System.out.println(!true); // false
    }
}

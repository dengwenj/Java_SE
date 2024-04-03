package pm.operator;

public class Demo03 {
    public static void main(String[] args) {
        int x = 10;
        // 先用后加，会先把 x 赋值给 y，然后再 + 1
        int y = x++;
        // 先加后用，会先把 x + 1，然后赋值给 z
        int z = ++x;

        System.out.println(x); // 12
        System.out.println(y); // 10
        System.out.println(z); // 12
    }
}

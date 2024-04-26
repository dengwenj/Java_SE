package pm.ww;

public class HashVal {
    public static void main(String[] args) {
        // 如果没有重写 hashCode 方法，不同对象计算出的哈希值是不同的
        Student s1 = new Student("朴睦", 24);
        Student s2 = new Student("朴睦", 24);
        System.out.println(s1.hashCode()); // 2055281021
        System.out.println(s2.hashCode()); // 1554547125

        // 如果已经重写 hashCode 方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        Student s3 = new Student("朴睦", 24);
        Student s4 = new Student("朴睦", 24);
        System.out.println(s3.hashCode()); // 26338151
        System.out.println(s4.hashCode()); // 26338151

        // 在小部分情况中，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样（哈希碰撞）
        System.out.println("abc".hashCode()); // 96354
        System.out.println("acD".hashCode()); // 96354
    }
}

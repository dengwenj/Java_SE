package pm.ww2;

import java.util.StringJoiner;

public class Demo04 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("---");
        sj.add("aaa");
        System.out.println(sj); // aaa

        StringJoiner sj1 = new StringJoiner("---");
        sj1.add("aaa").add("bbb").add("ccc");
        System.out.println(sj1); // aaa---bbb---ccc

        StringJoiner sj2 = new StringJoiner(", ", "[", "]");
        sj2.add("aaa").add("bbb").add("ccc");
        System.out.println(sj2); // [aaa, bbb, ccc]
    }
}

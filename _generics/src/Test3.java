import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        MyArrayList1 myArrayList1 = new MyArrayList1();
        myArrayList1.add("朴睦");
        myArrayList1.add("李雷");
        System.out.println(myArrayList1);

        MyArrayList2<Integer> myArrayList2 = new MyArrayList2<>();
        myArrayList2.add(1);
        myArrayList2.add(2);
        System.out.println(myArrayList2);
    }
}

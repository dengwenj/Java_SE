import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();

        method(list1);
        method(list2);
        method(list3);
    }

    // (ArrayList<? extends Ye> list
    public static void method(ArrayList<? super Zi> list) {

    }
}

class Ye {

}

class Fu extends Ye {

}

class Zi extends Fu {

}

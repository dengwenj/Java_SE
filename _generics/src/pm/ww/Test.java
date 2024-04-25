package pm.ww;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        BSCat bsCat = new BSCat("bs", 2);
        LHCat lhCat = new LHCat("lh", 4);
        ArrayList<Cat> list1 = new ArrayList<>();
        list1.add(bsCat);
        list1.add(lhCat);
        keepPet(list1);
    }

    // 饲养动物
    // 要求1：该方法能养所有品种的猫，但是不能养狗 ArrayList<? extends Cat>
    // 要求2：该方法能养所有品种的狗，但是不能养猫 ArrayList<? extends Dog>
    // 要求3：该方法能养所有动物，但是不能传递其他类型 ArrayList<? extends Animal>
    public static void keepPet(ArrayList<? extends Cat> list) {
        for (Cat cat : list) {
            cat.eat();
        }
    }
}

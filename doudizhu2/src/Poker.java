import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Poker {
    // 利用序号给牌进行排序
    static HashMap<Integer, String> hashMap = new HashMap<>();
    // 54张牌的序号
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        // 准备牌
        String[] color = {"♥", "♠", "♣", "♦"};
        String[] number = {"3", "4", "5", "8", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 牌
        int serialNumber = 1;
        for (String n : number) {
            // 每一种花色
            for (String c : color) {
                list.add(serialNumber);
                hashMap.put(serialNumber++, c + n);
            }
        }

        list.add(serialNumber);
        hashMap.put(serialNumber++, "小王");
        list.add(serialNumber);
        hashMap.put(serialNumber, "大王");
    }
    public Poker() {
        // 洗牌，打乱54张牌的序号
        Collections.shuffle(list);

        // 发牌, TreeSet 进行排序
        TreeSet<Integer> trumpCard = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int serialNumber = list.get(i);

            // 底牌
            if (i <= 2) {
                trumpCard.add(serialNumber);
                continue;
            }

            // 玩家1
            if (i % 3 == 0) {
                player1.add(serialNumber);
            } else if (i % 3 == 1) {
                // 玩家2
                player2.add(serialNumber);
            } else {
                // 玩家3
                player3.add(serialNumber);
            }
        }

        lookPoker("底牌", trumpCard);
        lookPoker("玩家一", player1);
        lookPoker("玩家二", player2);
        lookPoker("玩家三", player3);
    }

    public void lookPoker(String name, TreeSet<Integer> ts) {
        System.out.print(name + ": ");
        for (int serialNumber : ts) {
            System.out.print(hashMap.get(serialNumber) + " ");
        }
        System.out.println();
    }
}

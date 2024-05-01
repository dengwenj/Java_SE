import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PokerGame {
    // 54 张牌
    static ArrayList<String> list = new ArrayList<>();

    // 静态代码块
    // 特点：随着类的加载而加载，而且只执行一次
    static {
        // 准备牌
        String[] color = {"♥", "♠", "♣", "♦"};
        String[] number = {"3", "4", "5", "8", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 牌颜色
        for (String s : color) {
            // 牌
            for (String s1 : number) {
                list.add(s + s1);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame() {
        // 洗牌
        Collections.shuffle(list);

        // 发牌
        ArrayList<String> trumpCard = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            // 底牌
            if (i <= 2) {
                trumpCard.add(s);
            } else {
                // 玩家牌
                // 玩家1
                if (i % 3 == 0) {
                    player1.add(s);
                } else if (i % 3 == 1) {
                    // 玩家2
                    player2.add(s);
                } else {
                    // 玩家3
                    player3.add(s);
                }
            }
        }

        // 看牌
        lookPoker("底牌", trumpCard);
        lookPoker("玩家1", player1);
        lookPoker("玩家2", player2);
        lookPoker("玩家3", player3);
    }

    public void lookPoker(String name, ArrayList<String> poker) {
        System.out.print(name + "：");
        for (String s : poker) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

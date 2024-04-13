package pm.ww13;

import java.util.ArrayList;

public class Demo05 {
    public static void main(String[] args) {
        // 添加用户对象并判断是否存在
        // main 方法中定义一个集合，存入三个用户对象
        // id, username, password
        // 定义一个方法，根据 id 查找对应的用户信息，存在返回 true，反之
        ArrayList<Username> list = new ArrayList<>();

        list.add(new Username("001", "朴睦", "123456"));
        list.add(new Username("002", "李雷", "987654"));
        list.add(new Username("003", "韩梅梅", "123321"));

        boolean isExist = usernameById("0021", list);
        System.out.println(isExist);

        int idx = getUserIdxById("0021", list);
        System.out.println(idx);
    }

    public static boolean usernameById(String id, ArrayList<Username> list) {
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getId().equals(id)) {
//                return true;
//            }
//        }
//
//        return false;
        return getUserIdxById(id, list) >= 0;
    }

    public static int getUserIdxById(String id, ArrayList<Username> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}

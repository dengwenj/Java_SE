package pu.ww;

import java.util.Arrays;
import java.util.Random;

public class Demo05 {
    public static void main(String[] args) {
        // 评委打分
        // 在唱歌比赛中，有 6 名评委给选手打分，分数范围是 0 - 100 之间的整数，选手的最后得分为：
        // 去掉最高分、最低分后的 4 个评委的平均分
        Random r = new Random();
        int[] s = new int[6];
        for (int i = 0; i < 6; i++) {
            s[i] = r.nextInt(101);
        }

        // 计算出最高分和最低分
        int min = s[0];
        int max = s[0];
        for (int i = 1; i < s.length; i++) {
            if (s[i] < min) {
                min = s[i];
            }

            if (s[i] > max) {
                max = s[i];
            }
        }

        /*for (int i = 0; i < 10;) {
            if (满足条件才i++，否则一直循环) {
                i++;
            }
        }*/

        // 这个可以不用筛选出其他分，(直接 6 个的总和 - 最高分 - 最低分) / 4
        // 筛选出其他分
        int[] arr2 = new int[s.length - 2];
        // 伪造索引思想
        int index = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != min && s[i] != max) {
                // index++ 先用后加，所以先把上次的 index 给 arr2[index], 再 + 1
                arr2[index++] = s[i];
            }
        }

        int sum = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            sum += arr2[i];
        }
        System.out.println(Arrays.toString(s));
        System.out.println("去掉最高分" + max + "分，" + "去掉最低分" + min + "分，" + "最后得分：" + (double) (sum) / arr2.length + "分");
    }
}

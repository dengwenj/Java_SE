package pu.ww;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo10 {
    public static void main(String[] args) {
        // 生成中奖号码
        // 创建号码
        int[] arr = createNumber();
        System.out.println(Arrays.toString(arr));

        // 用户购买的双色球号码
        int[] userArr = userInputNumber();
        System.out.println(Arrays.toString(userArr));

        // 判断用户中将情况
        // 红球和蓝球的数量  只要出现过就行不管顺序
        int redCount = 0;
        int blueCount = 0;

        // 红球
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < userArr.length - 1; j++) {
                if (arr[i] == userArr[j]) {
                    redCount++;
                    break;
                }
            }
        }

        // 蓝球
       if (arr[arr.length - 1] == userArr[userArr.length - 1]) {
           blueCount++;
       }

        System.out.println("红球数量：" + redCount);
        System.out.println("蓝球数量：" + blueCount);

        // 根据红色数量和蓝色数量判断中了几等奖
    }

    public static int[] userInputNumber() {
        int[] arr = new int[7];

        // 红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6;) {
            System.out.println("请输入第" + (i + 1) + "个红球号码");
            int redNumber = sc.nextInt();

            // 1-33，不能重复
            if (redNumber >= 1 && redNumber <= 33) {
                // 不能重复
                if (!isExist(arr, redNumber)) {
                    arr[i] = redNumber;
                    i++;
                } else {
                    System.out.println("您输入的号码以重复，请重新输入号码");
                }
            } else {
                System.out.println("请输入正确的范围 1 ~ 33");
            }
        }

        // 蓝球号码，范围 1- 16
        while (true) {
            System.out.println("请输入蓝球号码");
            int blueNumber = sc.nextInt();
            if (blueNumber >= 1 && blueNumber <= 16) {
                arr[arr.length - 1] = blueNumber;
                break;
            } else {
                System.out.println("请输入正确范围内的 1 ~ 16");
            }
        }

        return arr;
    }

    public static int[] createNumber() {
        // 由6个红球号码和1个蓝球号码，一共7个
        int[] arr = new int[7];

        // 红球号码不能重复：6个 1-33之间， 1 2 3 4 5 6 对，1 2 3 4 4 5 错
        // 蓝球号码只有一个：3，1-16之间

        // 生成红球
        Random r = new Random();
        for (int i = 0; i < 6;) {
            int redNumber = r.nextInt(33) + 1;

            // 不能重复
            if (!isExist(arr, redNumber)) {
                arr[i] = redNumber;
                i++;
            }
        }

        // 生成蓝球
        arr[arr.length - 1] = r.nextInt(16) + 1;

        return arr;
    }

    public static boolean isExist(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return true;
            }
        }
        return false;
    }
}

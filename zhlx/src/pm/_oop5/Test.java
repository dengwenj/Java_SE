package pm._oop5;

public class Test {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        Person p1 = new Person("朴睦", 24, '男', new String[]{"书法", "股票"});
        Person p2 = new Person("李雷", 18, '男', new String[]{"读书", "画画"});
        Person p3 = new Person("韩妹妹", 28, '女', new String[]{"读书", "弹琴"});
        Person p4 = new Person("小爱童鞋", 18, '女', new String[]{"读书", "播音"});

        people[0] = p1;
        people[1] = p2;
        people[2] = p3;
        people[3] = p4;

        int sumAge = 0;
        for (int i = 0; i < people.length; i++) {
            sumAge += people[i].getAge();
        }

        int svgAge = sumAge / people.length;
        System.out.println("平均年龄："  + svgAge);

        int count = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < svgAge) {
                count++;
            }
        }
        System.out.println("年龄比平均年龄低的有" + count + "个");

        Person[] people1 = new Person[count];
        int index = 0;
        for (int i = 0; i < people.length; i++) {
            if (people[i].getAge() < svgAge) {
                people1[index++] = people[i];
            }
        }

        for (int i = 0; i < people1.length; i++) {
            System.out.println("分别是：" + people1[i].getName());
        }

    }
}

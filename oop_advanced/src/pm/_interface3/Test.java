package pm._interface3;

public class Test {
    public static void main(String[] args) {
        PPS pps = new PPS("乒乓球运动员", 20);
        System.out.println(pps.getName() + pps.getAge());
        pps.study();
        pps.say();

        PPC ppc = new PPC("乒乓球教练", 40);
        System.out.println(ppc.getName() + ppc.getAge());
        ppc.teach();
        ppc.say();

        LQS lqs = new LQS("篮球运动员", 25);
        System.out.println(lqs.getName() + lqs.getAge());
        lqs.study();

        LQC lqc = new LQC("蓝球教练", 45);
        System.out.println(lqc.getName() + lqc.getAge());
        lqc.teach();
    }
}

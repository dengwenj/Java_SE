package pm.ww6;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int ywScore;
    private int sxScore;
    private int yyScore;

    public Student() {
    }

    public Student(String name, int age, int ywScore, int sxScore, int yyScore) {
        this.name = name;
        this.age = age;
        this.ywScore = ywScore;
        this.sxScore = sxScore;
        this.yyScore = yyScore;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return ywScore
     */
    public int getYwScore() {
        return ywScore;
    }

    /**
     * 设置
     * @param ywScore
     */
    public void setYwScore(int ywScore) {
        this.ywScore = ywScore;
    }

    /**
     * 获取
     * @return sxScore
     */
    public int getSxScore() {
        return sxScore;
    }

    /**
     * 设置
     * @param sxScore
     */
    public void setSxScore(int sxScore) {
        this.sxScore = sxScore;
    }

    /**
     * 获取
     * @return yyScore
     */
    public int getYyScore() {
        return yyScore;
    }

    /**
     * 设置
     * @param yyScore
     */
    public void setYyScore(int yyScore) {
        this.yyScore = yyScore;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", ywScore = " + ywScore + ", sxScore = " + sxScore + ", yyScore = " + yyScore + "}";
    }

    @Override
    public int compareTo(Student o) {
        // 总分
        int sum1 = this.getSxScore() + this.getYyScore() + this.getYwScore();
        int sum2 = o.getSxScore() + o.getYyScore() + o.getYwScore();
        int d = (int) (sum1 - sum2);
        // 按语文排序
        d = d == 0 ? this.getYwScore() - o.getYwScore() : d;
        // 按数学排序
        d = d == 0 ? this.getSxScore() - o.getSxScore() : d;
        // 英语排序
        d = d == 0 ? this.getYyScore() - o.getYyScore() : d;
        // 按年龄排序
        d = d == 0 ? this.getAge() - o.getAge() : d;
        return d;
    }
}

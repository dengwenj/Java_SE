package pm.ww2;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {}

    public static int getMaxAge(ArrayList<Student> list) {
        int maxAge = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if (age > maxAge) {
                maxAge = age;
            }
        }
        return maxAge;
    }
}

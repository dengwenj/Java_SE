package pm.ww2;

import java.util.ArrayList;

public class StringF {
    public <T> boolean isExist(ArrayList<T> list, T s) {
        for (T s1 : list) {
            if (s.equals(s1)) {
                return true;
            }
        }
        return false;
    }
}

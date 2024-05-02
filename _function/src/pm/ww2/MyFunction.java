package pm.ww2;

import java.util.ArrayList;

@FunctionalInterface
public interface MyFunction {
    <T> boolean callback(ArrayList<T> list, T item);
}

package pm.anli;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodParams {
    Param[] value();
}

@interface Param {
    String name();
    Class<?> type();
    String[] acceptedValues();
}
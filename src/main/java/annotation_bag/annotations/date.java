package annotation_bag.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@author("Ferenc Fazekas")
@date("2/25/2017")
@Retention(RetentionPolicy.RUNTIME)
public @interface date {
    String value();
}

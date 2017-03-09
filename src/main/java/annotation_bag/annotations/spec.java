package annotation_bag.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@author("Ferenc Fazekas")
@date("3/7/2017")
@Retention(RetentionPolicy.RUNTIME)
public @interface spec {
    String value();
}

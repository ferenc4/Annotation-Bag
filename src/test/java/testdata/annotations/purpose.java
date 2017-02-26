package testdata.annotations;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@author("Ferenc Fazekas")
@date("2/25/2017")
@Retention(RetentionPolicy.RUNTIME)
public @interface purpose {
    String value();
}

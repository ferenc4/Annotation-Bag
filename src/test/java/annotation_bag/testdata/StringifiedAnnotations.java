package annotation_bag.testdata;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;

@author("Ferenc Fazekas")
@date("2/25/2017")
public final class StringifiedAnnotations {
    public static final String PURPOSE_SHOW_IT_WORKS = "@annotation_bag.testdata.annotations.Purpose(value=to show that the @Purpose annotation works)";
}

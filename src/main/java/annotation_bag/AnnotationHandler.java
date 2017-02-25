package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;

@author("Ferenc Fazekas")
@date("2/25/2017")
public class AnnotationHandler {
    ArrayList<Annotation> extractAllFrom(Class<?> annotatedClass, Class annotationClass) {
        ArrayList<Annotation> all = new ArrayList<>();
        all.addAll(Arrays.asList(annotatedClass.getDeclaredAnnotation(annotationClass)));
        return all;
    }
}

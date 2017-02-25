package annotation_bag;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Ferenc Fazekas
 * @date 2/25/2017
 */
public class AnnotationHandler {
    ArrayList<Annotation> extractAllFrom(Class<?> annotatedClass, Class annotationClass) {
        ArrayList<Annotation> all = new ArrayList<>();
        all.addAll(Arrays.asList(annotatedClass.getDeclaredAnnotation(annotationClass)));
        return all;
    }
}

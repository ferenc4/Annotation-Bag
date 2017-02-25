package annotation_bag.testdata.codebase;

import annotation_bag.testdata.annotations.Purpose;

/**
 * @author Ferenc Fazekas
 * @date 2/25/2017
 */
@Purpose("to show that the @Purpose annotation works")
public class AnnotatedByPurpose {
    @Purpose("to print hello world")
    void hello(){
        System.out.println("Hello world!");
    }
}

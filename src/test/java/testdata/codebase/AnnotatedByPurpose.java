package testdata.codebase;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;
import testdata.annotations.purpose;

@author("Ferenc Fazekas")
@date("2/25/2017")
@purpose("to show that the @purpose annotation works")
public class AnnotatedByPurpose {
    @purpose("to print hello world")
    void hello(){
        System.out.println("Hello world!");
    }
}

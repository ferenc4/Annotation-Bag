package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;
import annotation_bag.testdata.annotations.Purpose;
import annotation_bag.testdata.codebase.AnnotatedByPurpose;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

import static annotation_bag.testdata.StringifiedAnnotations.ANNOTATED_BY_PURPOSE_ANNOTATION_0;
import static org.junit.Assert.assertEquals;

@author("Ferenc Fazekas")
@date("2/25/2017")
public class AnnotationHandlerTest {

    @Test
    public void getSingleAnnotationFromClass(){
        ArrayList<Annotation> annotations = new AnnotationHandler()
                .extractAllFrom(AnnotatedByPurpose.class, Purpose.class);
        assertEquals(1, annotations.size());
        assertEquals(ANNOTATED_BY_PURPOSE_ANNOTATION_0, annotations.get(0).toString());
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
}
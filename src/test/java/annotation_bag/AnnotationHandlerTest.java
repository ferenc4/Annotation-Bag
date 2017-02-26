package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testdata.annotations.purpose;
import testdata.codebase.AnnotatedByPurpose;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

@author("Ferenc Fazekas")
@date("2/25/2017")
public class AnnotationHandlerTest {
    private static final String PURPOSE_SHOW_IT_WORKS = "@testdata.annotations.purpose(value=to show that the @purpose annotation works)";

    @Test
    public void getSingleAnnotationFromClass(){
        ArrayList<Annotation> annotations = new AnnotationHandler()
                .extractAllFrom(AnnotatedByPurpose.class, purpose.class);
        assertEquals(1, annotations.size());
        assertEquals(PURPOSE_SHOW_IT_WORKS, annotations.get(0).toString());
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
}
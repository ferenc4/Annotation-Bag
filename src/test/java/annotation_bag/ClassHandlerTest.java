package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testdata.codebase.AnnotatedByPurpose;

import java.io.File;

@author("Ferenc Fazekas")
@date("2/26/2017")
public class ClassHandlerTest {
    @Test
    public void getClassFromJavaFile() throws Exception {
        Class<AnnotatedByPurpose> expected = AnnotatedByPurpose.class;
        File classFile = new File("src/test/java/testdata/codebase/AnnotatedByPurpose.java");
        Class outputClass = ClassHandler.getClassOnClassPathFromJavaFile(classFile, "testdata");
        Assertions.assertThat(expected).isEqualTo(outputClass);
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
}
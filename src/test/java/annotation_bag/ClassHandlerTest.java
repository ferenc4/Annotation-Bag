package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;
import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testdata.codebase.AnnotatedByPurpose;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Method;

@author("Ferenc Fazekas")
@date("2/26/2017")
public class ClassHandlerTest {
    @Test
    public void getClassFromJavaFilePathWithForwardSlashes() throws Exception {
        Class<AnnotatedByPurpose> expected = AnnotatedByPurpose.class;
        File classFile = new File("src/test/java/testdata/codebase/AnnotatedByPurpose.java");
        Class outputClass = ClassHandler.getClassOnClassPathFromJavaFile(classFile, "testdata");
        Assertions.assertThat(expected).isEqualTo(outputClass);
    }

    @Test
    public void getClassFromJavaFilePathWithBackwardSlashes() throws Exception {
        Class<AnnotatedByPurpose> expected = AnnotatedByPurpose.class;
        File classFile = new File("src\\test\\java\\testdata\\codebase\\AnnotatedByPurpose.java");
        Class outputClass = ClassHandler.getClassOnClassPathFromJavaFile(classFile, "testdata");
        Assertions.assertThat(expected).isEqualTo(outputClass);
    }

    @Test(expected = ClassNotFoundException.class)
    public void attemptToGetNonExistentClass() throws Exception {
        File classFile = new File("src/test/java/testdata/This file doesn't exist.java");
        ClassHandler.getClassOnClassPathFromJavaFile(classFile, "testdata");
    }

    @Test(expected = AssertionError.class)
    public void rootPackageNameMissingFromPath() throws Exception {
        File classFile = new File("src/test/java/testdata/codebase/AnnotatedByPurpose.java");
        ClassHandler.getClassOnClassPathFromJavaFile(classFile, "bad");
    }

    @Test
    public void includeSrcFile() throws Exception {
        // create an empty source file
        File sourceFile = File.createTempFile("Hello", ".java");
        sourceFile.deleteOnExit();
        // generate the source code, using the source filename as the class name
        String classname = sourceFile.getName().split("\\.")[0];
        String sourceCode = "public class " + classname + "{ public String helloStr() { return \"Hello world!\";}}";
        // write the source code into the source file
        FileWriter writer = new FileWriter(sourceFile);
        writer.write(sourceCode);
        writer.close();
        Class<?> helloClass = ClassHandler.includeSrcFile(sourceFile, classname);

        // call a method on the loaded class
        Method helloMethod = helloClass.getDeclaredMethod("helloStr");
        String helloStrResult = String.valueOf(helloMethod.invoke(helloClass.newInstance()));
        Assertions.assertThat(helloStrResult).isEqualTo("Hello world!");
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
}
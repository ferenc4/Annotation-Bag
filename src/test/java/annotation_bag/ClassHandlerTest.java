package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testdata.utils.PrintFileName;

import java.io.File;
import java.lang.reflect.Method;

import static org.assertj.core.api.Assertions.assertThat;

@author("Ferenc Fazekas")
@date("2/26/2017")
public class ClassHandlerTest {
    @Test
    public void executeMethodOnEachClassInFolderAndSubFolders() throws NoSuchMethodException {
        String[] expected = {
                "Date2_25_17_Entry1.java",
                "Date2_25_17_Entry2.java",
                "Date2_26_17_Entry1.java",
                "Date2_26_17_Entry2.java",
                "Date2_26_17_Entry3.java",
                "Date2_27_17_Entry1.java",
                "Date2_27_17_Entry2.java",
                "Date2_28_17_Entry1.java"};
        ClassHandler classHandler = new ClassHandler("src/test/java/testdata/codebase/date_stats");
        Method m = PrintFileName.class.getMethod("savename", File.class);
        classHandler.executeForAll(m);
        assertThat(classHandler.getOutput()).containsExactlyInAnyOrder(expected);
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
}
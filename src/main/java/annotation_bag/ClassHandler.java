package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@author("Ferenc Fazekas")
@date("2/25/2017")
public class ClassHandler {
    public static Class getClassOnClassPathFromFile(File classFile, String rootPackage) throws Exception {
        Matcher packagePathMatcher = Pattern.compile(".*(" + rootPackage + ".*)").matcher(classFile.getCanonicalPath());
        assert packagePathMatcher.find();
        String packageFilePath = packagePathMatcher.group(1);
        String packagePath = packageFilePath.substring(0, packageFilePath.length() - ".class".length());
        packagePath = packagePath.replaceAll("\\\\|/", ".");
        return Class.forName(packagePath);
    }
}

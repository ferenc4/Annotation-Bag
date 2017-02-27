package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@author("Ferenc Fazekas")
@date("2/25/2017")
public class ClassHandler {
    public static Class getClassOnClassPathFromJavaFile(File classFile, String rootPackage) throws Exception {
        String canonicalPath = classFile.getCanonicalPath();
        String suffix = ".java";
        String invalidSuffix = "Filename expected to end with \"" + suffix + "\", but was \"" + canonicalPath + "\"";
        String missingPackage = "Filepath expected to contain package \"" + rootPackage + "\", but was \"" + canonicalPath + "\"";
        assert canonicalPath.endsWith(suffix) : invalidSuffix;
        Matcher packagePathMatcher = Pattern.compile(".*(" + rootPackage + ".*)").matcher(canonicalPath);
        assert packagePathMatcher.find() : missingPackage;
        String packageFilePath = packagePathMatcher.group(1);
        String packagePath = packageFilePath.substring(0, packageFilePath.length() - suffix.length());
        packagePath = packagePath.replaceAll("\\\\|/", ".");
        return Class.forName(packagePath);
    }
}

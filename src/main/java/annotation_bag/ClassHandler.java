package annotation_bag;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

@author("Ferenc Fazekas")
@date("2/25/2017")
public class ClassHandler {

    private final File parent;
    private ArrayList<String> output = new ArrayList<>();

    public ClassHandler(String folderPath) {
        parent = new File(folderPath);
        assert parent.exists();
    }

    public void executeForAll(Method m) {
        output = new ArrayList<>();
        File[] level0Children = parent.listFiles();
        viewAllFiles(m, level0Children);
    }

    void viewAllFiles(Method m, File... files) {
        for (File file : files) {
            if (file.isDirectory()) {
                viewAllFiles(m, file.listFiles()); // Calls itself again.
            } else {
                try {
                    output.add(String.valueOf(m.invoke(m.getDeclaringClass().newInstance(), file)));
                } catch (IllegalAccessException | InvocationTargetException | InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    ArrayList<String> getOutput() {
        return output;
    }
}

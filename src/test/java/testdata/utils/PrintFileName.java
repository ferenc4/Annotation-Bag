package testdata.utils;

import annotation_bag.annotations.author;
import annotation_bag.annotations.date;

import java.io.File;

@author("Ferenc Fazekas")
@date("2/26/2017")
public class PrintFileName {
    public String savename(File aFile) {
        return aFile.getName();
    }
}

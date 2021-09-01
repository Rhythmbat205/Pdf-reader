package com.example.btechdayspdfreader.functions;

import java.io.File;
import java.util.ArrayList;

public class PDFFinder {
    private final ArrayList<File> arrayList;

    public PDFFinder() {
        this.arrayList = new ArrayList<>();
    }

    public ArrayList<File> findPdf(File file) {
        File[] files = file.listFiles();
        //System.out.println(files);
        if (files == null) {
            return arrayList;
        }
        for (File singleFile : files) {
            //System.out.println(singleFile);
            if (singleFile.isDirectory() && !singleFile.isHidden()) {
                arrayList.addAll(findPdf(singleFile));
            } else if (!singleFile.isDirectory()) {
                if (singleFile.getName().endsWith(".pdf")) {
                    arrayList.add(singleFile);
                }
            }
        }
        return arrayList;
    }
}

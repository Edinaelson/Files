package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        File folder = new File(Names.path);
        File[] files = folder.listFiles();
        int fileCount = 0;

        for (File file : files){
            fileCount++;
            System.out.println(file.getName());
        }

        Colors.ukraine();
        System.out.println("Numero total de arquivos: " + fileCount);

    }
}
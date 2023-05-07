package org.example;

import java.util.ArrayList;
import java.util.List;

public class Extension {

    public static String img(int i) {
        //Criando a lista de extensões de imagens
        List<String> ex = new ArrayList<>();

        ex.add(".jpg");
        ex.add(".jpeg");
        ex.add(".png");
        ex.add(".psd");
        ex.add(".svg");
        ex.add(".gif");
        ex.add(".bmp");
        ex.add(".tiff");
        ex.add(".webp");
        ex.add(".ico");

        return ex.get(i);
    }

    public static String doc(int i) {
        //Criando a lista de extensões de imagens
        List<String> ex = new ArrayList<>();

        ex.add(".pdf");
        ex.add(".rar");
        ex.add(".docx");
        ex.add(".doc");
        ex.add(".zip");
        ex.add(".docm");
        ex.add(".txt");
        ex.add(".xml");
        ex.add(".xps");
        ex.add(".csv");
        ex.add(".ods");
        ex.add(".xls");
        ex.add(".xlsb");
        ex.add(".xlsx");
        ex.add(".xltm");
        ex.add(".odp");
        ex.add(".ppt");
        ex.add(".pptx");
        ex.add(".rtf");
        ex.add(".odg");
        ex.add(".odt");

        return ex.get(i);
    }

    public static String vid(int i) {
        //Criando a lista de extensões de imagens
        List<String> ex = new ArrayList<>();

        ex.add(".mp4");
        ex.add(".mov");
        ex.add(".avi");
        ex.add(".mpg");
        ex.add(".mkv");
        ex.add(".flv");
        ex.add(".wmv");
        ex.add(".mpeg");

        return ex.get(i);
    }

    public static String mus(int i) {
        //Criando a lista de extensões de imagens
        List<String> ex = new ArrayList<>();

        ex.add(".mp3");
        ex.add(".m4a");
        ex.add(".wav");
        ex.add(".wma");
        ex.add(".au");

        return ex.get(i);
    }

    public static String pro(int i) {
        //Criando a lista de extensões de imagens
        List<String> ex = new ArrayList<>();

        ex.add(".exe");
        ex.add(".jar");
        ex.add(".msi");
        ex.add(".iso");

        return ex.get(i);
    }
}

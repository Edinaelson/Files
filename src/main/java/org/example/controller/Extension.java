package org.example.controller;

public class Extension {

    public static final String[] SUPPORTED_EXTENSIONS_IMG = {
        ".jpg",".jpeg",".png",".psd",".svg",".gif",".bmp",".tiff",".webp",
        ".ico"
    };

    public static String getImg(int index) {
        if (index >= 0 && index < SUPPORTED_EXTENSIONS_IMG.length){
            return SUPPORTED_EXTENSIONS_IMG[index];
        }else {
            throw new IndexOutOfBoundsException("Index of bounds: " + index);
        }
    }

    public static final String[] SUPPORTED_EXTENSIONS_DOC = {
            ".pdf", ".rar", ".docx", ".doc", ".zip", ".docm", ".txt", ".xml",
            ".xps", ".csv", ".ods", ".xls", ".xlsb", ".xlsx", ".xltm", ".odp",
            ".ppt", ".pptx", ".rtf", ".odg", ".odt"
    };

    public static String GetDoc(int index) {
       if (index >= 0 && index < SUPPORTED_EXTENSIONS_DOC.length){
           return SUPPORTED_EXTENSIONS_DOC[index];
       } else {
           throw new IndexOutOfBoundsException("Index of bounds: " + index);
       }
    }

    public static final String[] SUPPORTED_EXTENSIONS_VID = {
            ".mp4",".mov",".avi",".mpg",".mkv",".flv",".wmv",".mpeg"
    };

    public static String getVid(int index) {
        if (index >= 0 && index < SUPPORTED_EXTENSIONS_VID.length){
            return SUPPORTED_EXTENSIONS_VID[index];
        }else {
            throw new IndexOutOfBoundsException("Index of bounds" + index);
        }
    }

    public static final String[] SUPPORTED_EXTENSIONS_MUSIC = {
            ".mp3",".m4a",".wav",".wma",".au"
    };

    public static String getMusic(int index) {
        if (index >= 0 && index < SUPPORTED_EXTENSIONS_MUSIC.length){
            return SUPPORTED_EXTENSIONS_MUSIC[index];
        }else{
            throw new IndexOutOfBoundsException("Index of bounds: " + index);
        }
    }

    public static final String[] SUPPORTED_EXTENSIONS_PROGRA = {
            ".exe",".jar",".msi",".iso"
    };

    public static String getProgra(int index) {
        if (index >= 0 && index < SUPPORTED_EXTENSIONS_PROGRA.length){
            return SUPPORTED_EXTENSIONS_PROGRA[index];
        }else{
            throw new IndexOutOfBoundsException("Index of bounds: " + index);
        }
    }
}

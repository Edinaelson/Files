package org.example.color;

public class Colors {

    static String resetColor = "\u001B[0m";

    public static void ukraine(){
        String blueColor = "\u001B[34m";
        String yellowColor = "\u001B[33m";
        String resetColor = "\u001B[0m";

        System.out.println(blueColor + "Ukraine" + yellowColor + "Peace"+ resetColor);
    }

    public static void greenColor(String name){
        String greenColors = "\u001B[32m";

        System.out.println(greenColors + name + resetColor);
    }

    public static void blueColor(String name){
        String blueColor = "\u001B[34m";

        System.out.println(blueColor + name + resetColor);
    }

    public static void cyanColor(String name){
        String cyanColor = "\u001B[36m";

        System.out.println(cyanColor + name + resetColor);
    }

    public static void redColor(String name){
        String redColor = "\u001B[31m";

        System.out.println(redColor + name + resetColor);
    }

    public static void magentaColor(String name){
        String magentaColor = "\u001B[35m";

        System.out.println(magentaColor + name + resetColor);
    }

}

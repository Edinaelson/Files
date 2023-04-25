package org.example;

public class Colors {

    public static void ukraine(){
        String redColor = "\u001B[31m";
        String blueColor = "\u001B[34m";
        String yellowColor = "\u001B[33m";

        String resetColor = "\u001B[0m";
        System.out.println(blueColor + "Ukraine" + yellowColor + "Peace"+ resetColor);
    }

}

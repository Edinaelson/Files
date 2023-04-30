package org.example;

import org.example.controller.Files;

public class Main{
    public static void main(String[] args) throws InterruptedException {

        while (true){
            Files.start();
            Files.imprimirContagem();
            Colors.ukraine();
            Files.zerarCont();
            Thread.sleep(10000);
        }
    }
}

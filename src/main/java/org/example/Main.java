package org.example;

import org.example.controller.Files;

import javax.swing.*;

public class Main extends JFrame{

    private JTextArea textArea;

    public Main() {
        // Configura a janela
        setTitle("Minha aplicação");
        setSize(640, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Cria um JTextArea para exibir a lista de arquivos movidos
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

    }

    public void updateTextArea(String files) {
        // Limpa o conteúdo anterior e adiciona a lista de arquivos movidos
        //textArea.setText("");
        if (files != null){
            textArea.append(files + "\n");
        }

    }

    public static void main(String[] args){

//        Main main = new Main();
//        main.setVisible(true);

        //Files.files();
        //Files.count();
        //Files.moveImg();

//        for (int i = 0;i<=Files.contImg;i++){
//            main.updateTextArea(Files.moveImg());
//        }
//        Thread thread1 = new Thread(() -> {
//            Files.moveImg();
//        });
//
//        Thread thread2 = new Thread(() -> {
//            Files.moveDocs();
//        });
//
//        thread1.start();
//        thread2.start();

        Files.moveImg();
        Files.moveDocs();
        Files.moveVides();
        Files.moveProgram();
        Files.moveMusic();

        System.out.println("quandidade imagens: " + Files.contImg);
        System.out.println("quanditdade documentos: " + Files.contDoc);
        System.out.println("quanditdade videos: " + Files.contVid);
        System.out.println("quanditdade musicas: " + Files.contMusic);
        System.out.println("quanditdade programas: " + Files.contPrograms);
        Colors.ukraine();

    }
}
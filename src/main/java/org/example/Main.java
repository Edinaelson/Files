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

        Main main = new Main();
        main.setVisible(true);

        //Files.files();
        //Files.count();
        //Files.moveImg();

        for (int i = 0;i<=Files.contImg;i++){
            main.updateTextArea(Files.moveImg());
        }

//        Files.moveImg();
//        Files.moveDocs();
        System.out.println("quandidade imagens: " + Files.contImg);
        System.out.println("quanditdade de documentos: " + Files.contDoc);
        Colors.ukraine();


    }
}
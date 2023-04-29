package org.example.controller;

import org.example.Colors;
import org.example.Names;
import java.io.File;

public class Files {
    public static void count(){
        File folder = new File(Names.path);
        File[] files = folder.listFiles();
        int fileCount = 0;

        for (File file : files){
            fileCount++;
        }
        System.out.println("Numero total de arquivo s: " + fileCount);
    }

    public static void files(){
        File folder = new File(Names.path);
        File[] files = folder.listFiles();

        for (File file : files){
            Colors.blueColor(file.getName());
        }
    }

    public static int contImg = 0;

    public static String moveImg(){
        //caminho da pasta de Imagens
        File path = new File(Names.path);

        //novo caminho
        File imagens = new File(Names.path+"\\imagens");
        if (!imagens.exists()){
            imagens.mkdir();
        }

        File[] archives = path.listFiles();

        //mover apenas imagens
        for (File archive : archives){
            if (archive.getName().endsWith(".jpg")
                    || archive.getName().endsWith(".jpeg")
                    || archive.getName().endsWith(".png")
            ){
                contImg++;
                File caminho = new File(imagens.getPath() + "/" + archive.getName());
                boolean movido = archive.renameTo(caminho);
                if (movido){
                    System.out.print("Imagem movido com sucesso: ");
                    Colors.greenColor(archive.getName());
                    return archive.getName();
                }else {
                    System.out.println("Não foi possivel mover imagem: " + archive.getName());
                    return null;
                }
            }
        }
        return null;
    }

    public static int contDoc;
    public static String moveDocs(){
        File path = new File(Names.path);

        File documentos = new File(Names.path+"\\Documentos");
        if (!documentos.exists()){
            documentos.mkdir();
        }

        File[] archives = path.listFiles();

        for (File archive : archives){
            if (archive.getName().endsWith(".pdf")
                    || archive.getName().endsWith(".rar")
                    || archive.getName().endsWith(".pptx")
            ){
                contDoc++;
                File caminho = new File(documentos.getPath() + "/" + archive.getName());
                boolean movido = archive.renameTo(caminho);
                if (movido){
                    System.out.print("Documento movido com sucesso: ");
                    Colors.blueColor(archive.getName());
                    archive.getName();
                }else {
                    System.out.println("Não foi possivel mover documento: " + archive.getName());
                    return null;
                }
            }
        }
        return null;
    }

}

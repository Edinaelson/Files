package org.example.controller;

import org.example.Colors;
import org.example.Names;
import java.io.File;
import java.util.List;

public class Files {
    public static int contImg = 0;
    public static int contDoc = 0;
    public static int contVid = 0;
    public static int contMusic = 0;
    public static int contPrograms = 0;

    public static String moveImg() throws InterruptedException {
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
                    || archive.getName().endsWith(".psd")
                    || archive.getName().endsWith(".svg")
                    || archive.getName().endsWith(".gif")
            ){
                // verfica se nome e igual, se for ele muda o nome do arquivo
                if(archive.getName().equals(archive.getName())){
                    contImg++;
                    File caminho = new File(imagens.getPath() + "/" + contImg + "_" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido){
                        System.out.print("Imagem movido com sucesso: ");
                        Colors.greenColor(archive.getName());
                    }
                } else { // segundo if (caso a condição do primeiro if não seja satisfeita)
                    contImg++;
                    File caminho = new File(imagens.getPath() + "/" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido) {
                        System.out.print("Imagem movido com sucesso: ");
                        Colors.greenColor(archive.getName());
                    } else {
                        System.out.println("Não foi possível mover a imagem: " + archive.getName());
                        return null;
                    }
                }
            }
        }
        return null;
    }

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
                    || archive.getName().endsWith(".docx")
                    || archive.getName().endsWith(".doc")
                    || archive.getName().endsWith(".pdf")
                    || archive.getName().endsWith(".zip")
                    || archive.getName().endsWith(".docm")
                    || archive.getName().endsWith(".txt")
                    || archive.getName().endsWith(".xml")
                    || archive.getName().endsWith(".xps")
                    || archive.getName().endsWith(".csv")
                    || archive.getName().endsWith(".ods")
                    || archive.getName().endsWith(".xls")
                    || archive.getName().endsWith(".xlsb")
                    || archive.getName().endsWith(".xlsx")
                    || archive.getName().endsWith(".xltm")
                    || archive.getName().endsWith(".bmp")
                    || archive.getName().endsWith(".odp")
                    || archive.getName().endsWith(".ppt")
                    || archive.getName().endsWith(".pptx")
                    || archive.getName().endsWith(".rtf")
                    || archive.getName().endsWith(".odg")
                    || archive.getName().endsWith(".odt")

            ){
                // verfica se nome e igual, se for ele muda o nome do arquivo
                if(archive.getName().equals(archive.getName())){
                    contDoc++;
                    File caminho = new File(documentos.getPath() + "/" + contDoc + "_" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido){
                        System.out.print("Documento movido com sucesso: ");
                        Colors.blueColor(archive.getName());
                    }
                }else {
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
        }
        return null;
    }

    public static String moveVides(){
        File path = new File(Names.path);

        File documentos = new File(Names.path+"\\Videos");
        if (!documentos.exists()){
            documentos.mkdir();
        }

        File[] archives = path.listFiles();

        for (File archive : archives){
            if (archive.getName().endsWith(".mp4")
                    || archive.getName().endsWith(".mov")
                    || archive.getName().endsWith(".avi")
                    || archive.getName().endsWith(".mpg")
                    || archive.getName().endsWith(".mkv")
                    || archive.getName().endsWith(".flv")
                    || archive.getName().endsWith(".wmv")
                    || archive.getName().endsWith(".mpeg")
            ){
                // verfica se nome e igual, se for ele muda o nome do arquivo
                if(archive.getName().equals(archive.getName())){
                    contVid++;
                    File caminho = new File(documentos.getPath() + "/" + contVid + "_" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido){
                        System.out.print("Video movido com sucesso: ");
                        Colors.cyanColor(archive.getName());
                    }
                } else {
                    contVid++;
                    File caminho = new File(documentos.getPath() + "/" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido){
                        System.out.print("Video movido com sucesso: ");
                        Colors.cyanColor(archive.getName());
                        archive.getName();
                    }else {
                        System.out.println("Não foi possivel mover video: " + archive.getName());
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static String moveMusic(){
        File path = new File(Names.path);

        File musicas = new File(Names.path+"\\Music");
        if (!musicas.exists()){
            musicas.mkdir();
        }

        File[] archives = path.listFiles();

        for (File archive : archives){
            if (archive.getName().endsWith(".mp3")
                    || archive.getName().endsWith(".m4a")
                    || archive.getName().endsWith(".wav")
                    || archive.getName().endsWith(".wma")
                    || archive.getName().endsWith(".au")
            ){
                // verfica se nome e igual, se for ele muda o nome do arquivo
                if(archive.getName().equals(archive.getName())){
                    contMusic++;
                    File caminho = new File(musicas.getPath() + "/" + contMusic + "_" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido){
                        System.out.print("Musica movido com sucesso: ");
                        Colors.redColor(archive.getName());
                    }
                }else {
                    contMusic++;
                    File caminho = new File(musicas.getPath() + "/" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido){
                        System.out.print("Musica movido com sucesso: ");
                        Colors.redColor(archive.getName());
                        archive.getName();
                    }else {
                        System.out.println("Não foi possivel mover musica: " + archive.getName());
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static String moveProgram(){
        File path = new File(Names.path);

        File programas = new File(Names.path+"\\Programas");
        if (!programas.exists()){
            programas.mkdir();
        }

        File[] archives = path.listFiles();

        for (File archive : archives){

            if (archive.getName().endsWith(".jar")
                    || archive.getName().endsWith(".msi")
                    || archive.getName().endsWith(".iso")
                    || archive.getName().endsWith(".exe")
            ){
                // verfica se nome e igual, se for ele muda o nome do arquivo
                if(archive.getName().equals(archive.getName())){
                    contPrograms++;
                    File caminho = new File(programas.getPath() + "/" + contPrograms + "_" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido){
                        System.out.print("Programa movido com sucesso: ");
                        Colors.magentaColor(archive.getName());
                    }
                }else {
                    contPrograms++;
                    File caminho = new File(programas.getPath() + "/" + archive.getName());
                    boolean movido = archive.renameTo(caminho);
                    if (movido){
                        System.out.print("Programa movido com sucesso: ");
                        Colors.magentaColor(archive.getName());
                        archive.getName();
                    }else {
                        System.out.println("Não foi possivel mover programa: " + archive.getName());
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public static void zerarCont(){
        Files.contImg = 0;
        Files.contDoc = 0;
        Files.contVid = 0;
        Files.contMusic = 0;
        Files.contPrograms = 0;
    }

    public static void imprimirContagem(){
        System.out.println("quantidade imagens: " + Files.contImg);
        System.out.println("quantidade documentos: " + Files.contDoc);
        System.out.println("quantidade videos: " + Files.contVid);
        System.out.println("quantidade musicas: " + Files.contMusic);
        System.out.println("quantidade programas: " + Files.contPrograms);
    }

    public static void start() throws InterruptedException {
        Files.moveImg();
        Files.moveDocs();
        Files.moveVides();
        Files.moveProgram();
        Files.moveMusic();
    }

    public static void run() throws InterruptedException{
        while (true){
            Files.start();
            Files.imprimirContagem();
            Colors.ukraine();
            Files.zerarCont();
            Thread.sleep(3000);
        }
    }

}

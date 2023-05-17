package org.example.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.nio.file.Files.walkFileTree;

public class Files {

    public static void mover() throws IOException {
        Map<String, List<Path>> mapExtensao = new HashMap<>();
        walkFileTree(Paths.get(System.getProperty("user.home") +  File.separator + "Downloads"),
                new RecolherFiles(mapExtensao));

        mapExtensao.forEach((key, value) -> {
            Path of = Path.of("." + File.separator + key);
            File file = of.toFile();
            if(value.size() > 0 && (file.exists() || file.mkdir())){
                salvar(of,value);
            }
        });

    }

    public static void salvar(Path diretorio, List<Path> arquivos){

        for (int i = 0; i < arquivos.size(); i++) {
            File caminho = new File(diretorio + File.separator + (i+1) + "_" + arquivos.get(i).getFileName());
            // A parte de cores c colcoa pra retornar as cores e joga direto aqui talvez fique melhor
            System.out.println(
                    (arquivos.get(i).toFile().renameTo(caminho)
                    ? "Imagem movido com sucesso: "
                    : "Não foi possível mover a imagem: " )
                    + caminho.getName()
            );
        }
    }
}
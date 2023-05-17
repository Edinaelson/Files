package org.example.controller;

import org.example.modelo.Extensao;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class RecolherFiles extends SimpleFileVisitor<Path> {

    private final Map<String, List<Path>> mapExtensao;

    public RecolherFiles(Map<String, List<Path>> mapExtensao) {
        this.mapExtensao = mapExtensao;
        mapExtensao.put("Imagens", new ArrayList<>());
        mapExtensao.put("Documentos", new ArrayList<>());
        mapExtensao.put("Vidios", new ArrayList<>());
        mapExtensao.put("Musicas", new ArrayList<>());
        mapExtensao.put("Programas", new ArrayList<>());
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {

        Optional<Extensao> extensao = Extensao
                .procurarExtensao(file
                        .getFileName()
                        .toString()
                        .replaceAll("(.*)(\\.(.+)$)", "$2"));

        extensao.ifPresent(value -> mapExtensao.get(value.getNome()).add(file));
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) {
        return FileVisitResult.SKIP_SUBTREE;
    }
}

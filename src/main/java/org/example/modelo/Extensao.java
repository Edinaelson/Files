package org.example.modelo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum Extensao {

    IMG("Imagens", List.of(".jpg",".jpeg",".png",".psd",".svg",".gif",".bmp",".tiff",".webp",".ico")),
    DOC("Documentos", List.of(
            ".pdf", ".rar", ".docx", ".doc", ".zip", ".docm", ".txt", ".xml",
            ".xps", ".csv", ".ods", ".xls", ".xlsb", ".xlsx", ".xltm", ".odp",
            ".ppt", ".pptx", ".rtf", ".odg", ".odt")),
    VID("Vidios", List.of(".mp4",".mov",".avi",".mpg",".mkv",".flv",".wmv",".mpeg")),
    MUSIC("Musicas", List.of(".mp3",".m4a",".wav",".wma",".au")),
    PROGRA("Programas", List.of(".exe",".jar",".msi",".iso"));

    private final String nome;
    private final List<String> extensoes;

    Extensao(String nome, List<String> extensoes) {
        this.nome = nome;
        this.extensoes = extensoes;
    }

    public String getNome() {
        return nome;
    }

    public List<String> getExtensoes() {
        return extensoes;
    }

    public static Optional<Extensao> procurarExtensao(String extensao){
        return Arrays.stream(Extensao.values())
                .toList().stream()
                .filter((e) -> e.getExtensoes().contains(extensao))
                .findFirst();
    }
}

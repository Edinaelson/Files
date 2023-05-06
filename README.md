>Status: **Desenvolvendo**💻
## Organizador de arquivos!
### **Descrição**📃

o programa organiza os arquivos por extensão, por exemplo, se arquivo termirnar em *.mp3* ele vai
enviar o arquivo para a pasta imagem, se não houver ele cria e envia.

- [x] Mover imagens.
- [x] Mover documentos.
- [x] Mover videos.
- [x] Mover programas.
- [x] Criar pasta se não houver.

> 1- Linha para mudar a pasta de acordo com a necessidade. *Classe Names*
```java
    //AQUI ELE IRÁ FAZER AS BUSCAS POR ARQUIVOS E ORGANIZAR.
    public static String path = "C:\\Users\\sedin\\Downloads";
```
> 2- Dé o start na aplicação com sua IDE, programa irá atualizar a cada 3 segundos em busca de novos arquivos.
```java
    Thread.sleep(3000);
```

### Extensão suportado.

>documentos | video | musica | programa
>:--------- |:-----:| -------: | -------:
>| .pdf |.mp4 |.mp3 |.jar
>| .rar |.mov |.m4a |.msi
>|.docx |.avi |.wav |.iso
>|.doc  |.mpg |.wma |.exe
>|.pdf  |.mkv |.au  |
>|.zip  |.flv
>|.docm |.wmv
>|.txt  |.mpeg
>|.xml
>|.xps
>|.csv
>|.ods
>|.xls
>|.xlsb
>|.xlsx
>|.xltm
>|.bmp
>|.odp
>|.ppt
>|.pptx
>|.rtf
>|.odg
>|.odt




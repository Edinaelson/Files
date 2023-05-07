
import java.util.ArrayList;
import java.util.List;

public class Extension {

    public void extension(){
         //Criando a lista de extensões de imagens
        List<String> ex = new ArrayList<>();

        ex.add(".jpg");
        ex.add(".jpeg");
        ex.add(".png");
        ex.add(".psd");
        ex.add(".svg");
        ex.add(".gif");
        ex.add(".bmp");
        ex.add(".tiff");
        ex.add(".webp");
        ex.add(".ico");

        // Iterando sobre a lista de extensões de imagens usando o tamanho da lista
        for (int i = 0; i < ex.size(); i++) {
            String ext = ex.get(i);
            System.out.println("Extensão " + (i+1) + ": " + ext);
        }
    }

}

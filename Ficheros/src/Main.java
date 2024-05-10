import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String rutaFichero = System.getProperty("user.home")+"/Desktop/Documents";

        File archivo = new File(rutaFichero);
        if (archivo.createNewFile()) {
            System.out.println("fichero creado");
        } else {
            System.out.println("fichero no creado");
        }


    }
}
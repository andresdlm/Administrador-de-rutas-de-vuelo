
package documento;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lector_de_Archivo {


    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("C:\\Users\\andre\\Documents\\Estructura de Datos\\Proyecto 1\\Proyecto estructura\\Tatteo\\src\\documento\\repositorio_vuelos.txt");
        FileReader fileReader = new FileReader("C:\\Users\\andre\\Documents\\Estructura de Datos\\Proyecto 1\\Proyecto estructura\\Tatteo\\src\\documento\\repositorio_vuelos.txt");

        fileWriter.write("Esto es una prueba");
        fileWriter.close();
    }


}

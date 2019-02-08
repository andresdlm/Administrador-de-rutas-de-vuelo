package documento;

import java.io.*;

public class Repositorio {

    public void IngresarCiudad(String Ciudad, String Aeropuerto, String Pais) {

        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\andre\\Documents\\Estructura de Datos\\Proyecto 1\\Tatteo\\src\\documento\\repositorio_ciudades.txt", true);
            fileWriter.write(Ciudad +","+ Aeropuerto +","+ Pais + "\r\n");
            fileWriter.close();

        }catch (IOException ex){
            System.out.println("No se ha encontrado el archivo");
        }
    }
/*
    public static void main(String[] args) {
        Repositorio repo = new Repositorio();
        repo.IngresarCiudad("Caracas", "Maiquetia", "Venezuela");
    }
*/
}

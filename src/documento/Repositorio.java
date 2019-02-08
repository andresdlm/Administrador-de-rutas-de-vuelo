package documento;

import java.io.*;

public class Repositorio {

    private static File repo_ciudad = new File("C:\\Users\\andre\\Documents\\Estructura de Datos\\Proyecto 1\\Tatteo\\src\\documento\\repositorio_ciudades.txt");
    private static File repo_vuelos = new File("C:\\Users\\andre\\Documents\\Estructura de Datos\\Proyecto 1\\Tatteo\\src\\documento\\repositorio_vuelos.txt");
    private static String[] ciudad = new String[5];

    public void IngresarCiudad(String Ciudad, String Aeropuerto, String Pais) {

        try {

            FileWriter fileWriter = new FileWriter(repo_ciudad, true);
            fileWriter.write(Ciudad +","+ Aeropuerto +","+ Pais + "\r\n");
            fileWriter.close();

        }catch (IOException ex){
            System.out.println("No se ha encontrado el archivo");
        }
    }

    public void leer_ciudad() throws IOException {

        FileReader fileReader = new FileReader(repo_ciudad);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String lines;

        for(int j=0;j<ciudad.length;j++){
            if(( lines = bufferedReader.readLine()) != null){
                ciudad[j] = lines;
            }
        }

    }

    public static void main(String[] args) {
        Repositorio repo = new Repositorio();
        //repo.IngresarCiudad("Caracas", "Maiquetia", "Venezuela");

        try {
            repo.leer_ciudad();
        }catch (IOException e){
            System.out.println("No se encontro el archivo");
        }
        for (int i = 0; i < ciudad.length ; i++) {
            System.out.println(ciudad[i] + "");
        }
    }
}

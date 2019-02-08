package documento;

import java.io.*;

public class Repositorio {

    private static String UbicacionRepoCiudad = "C:\\Users\\andre\\Documents\\Estructura de Datos\\Proyecto 1\\Tatteo\\src\\documento\\repositorio_ciudades.txt";
    private static String UbicacionRepoVuelos = "C:\\Users\\andre\\Documents\\Estructura de Datos\\Proyecto 1\\Tatteo\\src\\documento\\repositorio_vuelos.txt";
    private static File repo_ciudad = new File(UbicacionRepoCiudad);
    private static File repo_vuelos = new File(UbicacionRepoVuelos);
    private static String[] linea = new String[5];

    private static String[] ciudad = new String[linea.length];
    private static String[] aeropuerto = new String[linea.length];
    private static String[] pais = new String[linea.length];

    public static void setUbicacionArchivo(String ubicacionArchivo) {
        UbicacionRepoCiudad = ubicacionArchivo;
    }

    public static void setUbicacionRepoVuelos(String ubicacionRepoVuelos) {
        UbicacionRepoVuelos = ubicacionRepoVuelos;
    }

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

        for(int j=0;j<linea.length;j++){
            if(( lines = bufferedReader.readLine()) != null){
                linea[j] = lines;
            }
        }
    }

    public void SepararString(){
        for (int i = 0; i < linea.length; i++) {
            if(linea[i] != null){
                ciudad[i] = linea[i].split(",")[0];
                aeropuerto[i] = linea[i].split(",")[1];
                pais[i] = linea[i].split(",")[2];
            }
        }
    }

    public static void main(String[] args) {
        Repositorio repo = new Repositorio();
        //repo.IngresarCiudad("Caracas", "Maiquetia", "Venezuela");

        try {
            repo.leer_ciudad();
            repo.SepararString();
        }catch (IOException e){
            System.out.println("No se encontro el archivo");
        }
        for (int i = 0; i < linea.length ; i++) {
            if(linea[i] != null){
                System.out.println(ciudad[i] + "\n");
            }
        }
    }
}

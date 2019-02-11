package tatteo;

import java.io.*;

public class Repositorio {

    //Datos de vuelo
    private static String UbicacionRepoVuelos;
    private File repo_vuelos = new File(UbicacionRepoVuelos);
    private String[] lineaVuelo = new String[arrayLength];
    private int[] numeroVuelo = new int[lineaVuelo.length];
    private String[] aerolinea = new String[lineaVuelo.length];
    private int[] costoVuelo = new int[lineaVuelo.length];
    private int[] duracionVuelo = new int[lineaVuelo.length];

    //Datos de rutas de vuelo
    private static String UbicacionRepoRutas;
    private File repo_rutas = new File(UbicacionRepoRutas);
    private String[] lineaRuta = new String[arrayLength];
    private String[] origen = new String[lineaRuta.length];
    private String[] destino = new String[lineaRuta.length];

    //Datos de ciudad
    private static String UbicacionRepoCiudad;
    private File repo_ciudad = new File(UbicacionRepoCiudad);
    private String[] lineaCiudad = new String[arrayLength];
    private String[] ciudad = new String[lineaCiudad.length];
    private String[] aeropuerto = new String[lineaCiudad.length];
    private String[] pais = new String[lineaCiudad.length];

    private final static int arrayLength = 15;

    //Ingresar datos en Repositorio de Vuelos
    public void IngresarDatos(int numeroVuelo, String aerolinea, int costoVuelo, int duracionVuelo){
        try {

            FileWriter fileWriter = new FileWriter(repo_vuelos, true);
            fileWriter.write(numeroVuelo +","+ aerolinea +","+ costoVuelo +","+ duracionVuelo +"\r\n");
            fileWriter.close();

        }catch (IOException ex){
            System.out.println("No se ha encontrado el archivo");
        }
    }

    //Ingresar datos en Repositorio de Rutas
    public void IngresarDatos(String origen, String destino){
        try {

            FileWriter fileWriter = new FileWriter(repo_rutas, true);
            fileWriter.write(origen +","+ destino +"\r\n");
            fileWriter.close();

        }catch (IOException ex){
            System.out.println("No se ha encontrado el archivo");
        }
    }

    //Ingresar datos en Repositorio de Ciudades
    public void IngresarDatos(String Ciudad, String Aeropuerto, String Pais) {
        try {

            FileWriter fileWriter = new FileWriter(repo_ciudad, true);
            fileWriter.write(Ciudad +","+ Aeropuerto +","+ Pais + "\r\n");
            fileWriter.close();

        }catch (IOException ex){
            System.out.println("No se ha encontrado el archivo");
        }
    }

    public void leerRepositorio(File repositorio, String[] linea) throws IOException {

        FileReader fileReader = new FileReader(repositorio);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String lines;

        for(int i = 0; i< linea.length; i++){
            if(( lines = bufferedReader.readLine()) != null){
                linea[i] = lines;
            }
        }
        if(repositorio == repo_vuelos){
            SepararStringVuelo();
        }else if(repositorio == repo_rutas){
            SepararStringRuta();
        }else{
            SepararStringCiudad();
        }

    }

    private void SepararStringVuelo(){
        for (int i = 0; i < lineaVuelo.length; i++) {
            if(lineaVuelo[i] != null){
                numeroVuelo[i] = Integer.parseInt(lineaVuelo[i].split(",")[0]);
                aerolinea[i] = lineaVuelo[i].split(",")[1];
                costoVuelo[i] = Integer.parseInt(lineaVuelo[i].split(",")[2]);
                duracionVuelo[i] = Integer.parseInt(lineaVuelo[i].split(",")[3]);
            }
        }
    }

    private void SepararStringRuta(){
        for (int i = 0; i < lineaRuta.length; i++) {
            if(lineaRuta[i] != null){
                origen[i] = lineaRuta[i].split(",")[0];
                destino[i] = lineaRuta[i].split(",")[1];
            }
        }
    }

    private void SepararStringCiudad(){
        for (int i = 0; i < lineaCiudad.length; i++) {
            if(lineaCiudad[i] != null){
                ciudad[i] = lineaCiudad[i].split(",")[0];
                aeropuerto[i] = lineaCiudad[i].split(",")[1];
                pais[i] = lineaCiudad[i].split(",")[2];
            }
        }
    }


    public int getNumeroVuelo(int i) {
        return numeroVuelo[i];
    }

    public String getAerolinea(int i) {
        return aerolinea[i];
    }

    public int getCostoVuelo(int i) {
        return costoVuelo[i];
    }

    public int getDuracionVuelo(int i) {
        return duracionVuelo[i];
    }

    public String getOrigen(int i) {
        return origen[i];
    }

    public String getDestino(int i) {
        return destino[i];
    }

    public String getCiudad(int i) {
        return ciudad[i];
    }

    public String getAeropuerto(int i) {
        return aeropuerto[i];
    }

    public String getPais(int i) {
        return pais[i];
    }

    public static void setUbicacionRepoVuelos(String ubicacionRepoVuelos) {
        UbicacionRepoVuelos = ubicacionRepoVuelos;
    }

    public static void setUbicacionRepoRutas(String ubicacionRepoRutas) {
        UbicacionRepoRutas = ubicacionRepoRutas;
    }

    public static void setUbicacionRepoCiudad(String ubicacionRepoCiudad) {
        UbicacionRepoCiudad = ubicacionRepoCiudad;
    }

    /*
    public static void main(String[] args) {
        Repositorio repo = new Repositorio();
        repo.IngresarDatos("Caracas", "Maiquetia", "Venezuela");

        try {
            repo.leerRepositorio(repo.repo_ciudad, repo.lineaCiudad);
            repo.SepararStringCiudad();
        }catch (IOException e){
            System.out.println("No se encontro el archivo");
        }

        for (int i = 0; i < arrayLength ; i++) {
            if(repo.lineaCiudad[i] != null){
                System.out.println(repo.ciudad[i] + "\n");
            }
        }
    }*/
}

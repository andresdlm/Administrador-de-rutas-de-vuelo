package tatteo;
import java.util.ArrayList;
import java.util.List;


public class Ciudad {
    private String nombre;
    private String aeropuerto;
    private String pais;
    private int numCiudad = 0 ;//Atributo del objeto
    private static int num = 0; //Lleva la cuenta de los objetos creados

    private static List<Vuelo> vuelos;


    //Constructor
    public Ciudad(String nombre, String aeropuerto, String pais) {
        this.nombre = nombre;
        this.aeropuerto = aeropuerto;
        this.pais = pais;
        numCiudad = num;
        num++;
    }

    //Agregar vuelo a la lista de vuelos
    public void addVuelo (Vuelo vuelo){
        if(vuelos == null){
            vuelos = new ArrayList<>();
        }
        vuelos.add(vuelo);
    }
    
    //Modificar vuelo 
    public Vuelo modidificarVuelo (String o, String d, int du, int co, String nV, String lA, List <Ciudad> lC, List <Vuelo> lV, Vuelo v){ //Se le pasa por parametros los datos obtenidos de la tabla de vuelo y las listas de ciudades y vuelos que hay en la interfaz
     
        
        int x = 0;
        Ciudad nuevOrigen = null;
        Ciudad nuevoDestino = null; 
        
        while(x < lC.size()){
            if(lC.get(x).getNombre() == o){
                nuevOrigen = lC.get(x); 
            }else{
                x++; 
            }  
        }
        
        x = 0; 
        while(x < lC.size()){
            if(lC.get(x).getNombre() == d){
                nuevoDestino = lC.get(x); 
            }else{
                x++; 
            }  
        }
        
        v.setOrigen(nuevOrigen);
        v.setDestino(nuevoDestino);
        v.setDuracion(du);
        v.setCosto(co);
        v.setNumV(nV);
        v.setLineaA(lA);
        
        return v; 
    }



    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public static int getNum() {
        return num;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public String getPais() {
        return pais;
    }

    public List<Vuelo> getVuelos() {
        return vuelos;
    }

    public int getNumCiudad() {
        return numCiudad;
    }

    public String getNomAerPais(){ return nombre + ", " + aeropuerto + ", "+ pais;}

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setVuelos(List<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }


}

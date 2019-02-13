/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tatteo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andrea
 */
public class Ciudad {
    private String nombre; 
    private String aeropuerto; 
    private String pais; 
    
    private String city;
    private List<Vuelo> vuelos;
    
    //Constructor
    public Ciudad(String nombre, String aeropuerto, String pais) {
        this.nombre = nombre;
        this.aeropuerto = aeropuerto; 
        this.pais = pais; 
        
    }
    
    //Agregar vuelo a la lista de vuelos   
    public void addVuelo (Vuelo vuelo){
        if(vuelos == null){
            vuelos = new ArrayList<>(); 
        }
        vuelos.add(vuelo); 
      }
    
    //Getters 
    public String getNombre() {
        return nombre;
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

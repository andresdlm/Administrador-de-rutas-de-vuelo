/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tatteo;

/**
 *
 * @author andrea
 */
public class Vuelo {
        
    private Ciudad origen;
    private Ciudad destino; 
    private double duracion; 
    private double costo; 
    private int numV; 
    private String lineaA; 
   
 
    //Constructor
    public Vuelo(Ciudad origen, Ciudad destino, double duracion, double costo, int numV, String lineaA) {
        this.origen = origen; 
        this.destino = destino; 
        this.duracion = duracion; 
        this.costo = costo; 
        this.numV = numV; 
        this.lineaA = lineaA; 
    }
    
    //Getters 
    public Ciudad getOrigen() {
        return origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public double getDuracion() {
        return duracion;
    }

    public double getCosto() {
        return costo;
    }

    public int getNumV() {
        return numV;
    }

    public String getLineaA() {
        return lineaA;
    }
    
    //Setters
    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setNumV(int numV) {
        this.numV = numV;
    }

    public void setLineaA(String lineaA) {
        this.lineaA = lineaA;
    }

  
}

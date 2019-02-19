package tatteo;

public class Vuelo {

    private Ciudad origen;
    private Ciudad destino;
    private int duracion;
    private int costo;
    private String  numV;
    private String lineaA;


    //Constructor
    public Vuelo(Ciudad origen, Ciudad destino, int duracion, int costo, String numV, String lineaA) {
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

    public int getDuracion() {
        return duracion;
    }

    public int getCosto() {
        return costo;
    }

    public String getNumV() {
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

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setNumV(String numV) {
        this.numV = numV;
    }

    public void setLineaA(String lineaA) {
        this.lineaA = lineaA;
    }

  
}

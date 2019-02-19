package tatteo;

import java.util.List;
import javax.swing.JOptionPane;


public class RutaAerea {

    private int [] ultimo;
    private int [] D;
    private boolean [] F;
    private int s, n;  // vértice origen y número de vértices

    /*
    En la interfaz se debe primero llenar pesoCosto y pesoTiempo para luego pasarlos por parametros
    al constructor de RutaAerea.
    */
    public RutaAerea(List <Ciudad> otraListaCiudades, int origen) { //Recibe la lista de ciudades desde la interfaz

        n = otraListaCiudades.size();
        s = origen;
        ultimo = new int [n];
        D = new int [n];
        F = new boolean [n];
    }

    public void caminoMinimo(int [][] pesos, List <Vuelo> elegido){
        // valores iniciales
        for (int i = 0; i < n; i++){
            F[i] = false;
            D[i] = pesos[s][i];
            ultimo[i] = s;
        }

        F[s] = true;
        D[s] = 0;
        // Pasos para marcar los n-1 vértices
        for (int i = 1; i < n; i++){
            int v = minimo(); //selecciona vértice no marcado de menor distancia
            F[v] = true;
            // actualiza distancia de vértices no marcados
            for (int w = 1; w < n; w++)
                if (!F[w])
                    if ((D[v] + pesos[v][w]) < D[w]){
                        D[w] = D[v] + pesos[v][w];
                        ultimo[w] = v;
                        
                        Vuelo vu;
                        for (int n = 0; n < elegido.size(); n++) {
                            if(elegido.get(n).getCosto() == ultimo[w]){
                                vu = elegido.get(n);
                                JOptionPane.showMessageDialog(null, "RUTA AEREA RECOMENDADA: " + "\nVuelo: " + vu.getNumV());
                         }
                    }
        }
        
        }
        
    } //Recibe por parametro bien sea la matriz del peso en costo o en tiempo

    public int minimo(){
        int mx = Integer.MAX_VALUE;
        int v = 1;
        for (int j = 1; j < n; j++)
            if (!F[j] && (D[j]<= mx)){
                mx = D[j];
                v = j;
            }
        return v;
    }

    public int [][] pesoCosto (List <Vuelo> vueloList, List <Ciudad> ciudadList){
        int posicion = 0;
        Ciudad aux, aux1;
        int [][] costo = new int [ciudadList.size()][ciudadList.size()];
        for (int i = 0; i < Ciudad.getNum(); i++) {
            for (int j = 0; j < Ciudad.getNum(); j++) {
                if (i == j){
                    costo [i][j] = 0;
                }else{
                    while(posicion < vueloList.size()){
                        aux = vueloList.get(posicion).getOrigen();
                        aux1 = vueloList.get(posicion).getDestino();
                        if(aux.getNumCiudad() == j && aux1.getNumCiudad() == i) {
                            costo [i][j] = vueloList.get(posicion).getCosto();
                        }
                        posicion ++;
                    }
                }
            }
        }
        return costo;
    } //Recibe la lista de vuelos desde la interfaz

    public int [][] pesoTiempo (List <Vuelo> lV, List <Ciudad> lC){
        int posicion = 0;
        int [][]tiempo = new int [lC.size()][lC.size()];
        for (int i = 0; i < Ciudad.getNum(); i++) {
            for (int j = 0; j < Ciudad.getNum(); j++) {
                if (i == j){
                    tiempo [i][j] = 0;
                }else{

                    while(posicion < lV.size()){
                        if(lV.get(posicion).getOrigen().getNumCiudad() == j && lV.get(posicion).getDestino().getNumCiudad() == i) {
                            tiempo [i][j] = lV.get(posicion).getDuracion();
                        }
                        posicion ++;
                    }
                }
            }
        }

        return tiempo;
    } //Recibe la lista de vuelos desde la interfaz
}

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
public class Grafo {
    private List<Ciudad> ciudades;
 
    public void addCiudad(Ciudad ciudad) {
        if (ciudades == null) {
            ciudades = new ArrayList<>();
        }
        ciudades.add(ciudad);
    }
 
    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    
}

package tatteo;
import java.util.ArrayList;
import java.util.List;


public class Grafo {
    public List<Ciudad> ciudades;

    public void addCiudad(Ciudad ciudad) {
        if (ciudades == null) {
            ciudades = new ArrayList<>();
        }
        ciudades.add(ciudad);
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public String[] nombresCiudades(int size){
        String[] nombresdeCiudades = new String[size];
        for(int i=0; i < size ; i++){
            nombresdeCiudades[i] = this.getCiudades().get(i).getNomAerPais();
        }

        return nombresdeCiudades;
    }

}
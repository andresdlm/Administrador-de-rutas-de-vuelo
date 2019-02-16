package tatteo;
import java.util.ArrayList;
import java.util.List;


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
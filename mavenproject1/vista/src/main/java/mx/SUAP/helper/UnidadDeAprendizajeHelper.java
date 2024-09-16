package mx.desarrollo.helper;

import java.util.List;
import mx.SUAP.entidad.UnidadDeAprendizaje;
import mx.desarrollo.integracion.ServiceLocator;

public class UnidadDeAprendizajeHelper {

    public List<UnidadDeAprendizaje> getAllMaterias() {
        return ServiceLocator.getInstanceUnidadDeAprendizajeDAO().findAll();
    }
}

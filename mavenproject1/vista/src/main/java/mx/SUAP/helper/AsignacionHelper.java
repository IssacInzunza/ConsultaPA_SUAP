package mx.desarrollo.helper;

import java.util.List;
import mx.SUAP.entidad.Asignacion;
import mx.desarrollo.integracion.ServiceLocator;

public class AsignacionHelper {

    public List<Asignacion> getlistAsignaciones() {
        return ServiceLocator.getInstanceAsignacionDAO().findAll();
    }

    public void addAsignacion(Asignacion asignacion) {
        ServiceLocator.getInstanceAsignacionDAO().saveOrUpdate(asignacion);
    }

    public void deleteAsignacion(Asignacion asignacion) {
        ServiceLocator.getInstanceAsignacionDAO().delete(asignacion);
    }

    public void updateAsignacion(Asignacion asignacion) {
        ServiceLocator.getInstanceAsignacionDAO().saveOrUpdate(asignacion);
    }
}

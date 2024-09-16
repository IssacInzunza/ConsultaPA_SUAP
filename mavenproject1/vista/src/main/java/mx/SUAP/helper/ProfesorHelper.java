package mx.desarrollo.helper;

import java.util.List;
import mx.SUAP.entidad.Asignacion;
import mx.SUAP.entidad.Profesores;
import mx.desarrollo.integracion.ServiceLocator;

public class ProfesorHelper {

    public List<Profesores> getlistProfesores() {
        return ServiceLocator.getInstanceProfesoresDAO().findAll();
    }

    public void updateAsignacion(Asignacion asignacion) {
        ServiceLocator.getInstanceAsignacionDAO().saveOrUpdate(asignacion);
    }

    public List<Asignacion> getAsignacionesPorProfesor(Profesores profesor) {
        return ServiceLocator.getInstanceAsignacionDAO().findByOneParameter(String.valueOf(profesor.getIdProfesor()), "idProfesor");
    }

    public void deleteProfesor(Profesores profesor) {
        ServiceLocator.getInstanceProfesoresDAO().delete(profesor);
    }
}

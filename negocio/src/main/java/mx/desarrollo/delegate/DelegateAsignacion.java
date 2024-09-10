/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import java.util.List;
import mx.desarrollo.integracion.ServiceLocator;
import mx.SUAP.entidad.Asignacion;

/**
 *
 * @author issac
 */
public class DelegateAsignacion {
    
    public void saveAsignacion(Asignacion asignacion){
        ServiceLocator.getInstanceAsignacionDAO().save(asignacion);
    }
    
    public List<Asignacion> findAllAsignaciones() {
        return ServiceLocator.getInstanceAsignacionDAO().findAll();
    }
     
     public void updateAsignacion(Asignacion asignacion) {
        ServiceLocator.getInstanceAsignacionDAO().update(asignacion);
    }
     
     public void deleteAsignacion(Asignacion asignacion) {
        ServiceLocator.getInstanceAsignacionDAO().delete(asignacion);
    }
}

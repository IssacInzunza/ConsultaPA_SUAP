/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import java.util.List;
import mx.desarrollo.delegate.DelegateAsignacion;
import mx.SUAP.entidad.Asignacion;
/**
 *
 * @author issac
 */
public class FacadeAsignacion {
    private final DelegateAsignacion delegateAsignacion;
    
    public FacadeAsignacion() {
        this.delegateAsignacion = new DelegateAsignacion();
    }
    
    public void guardarAsignacion(Asignacion asignacion){
        delegateAsignacion.saveAsignacion(asignacion);
    }
    
    public List<Asignacion> findAllAsignaciones() {
        return delegateAsignacion.findAllAsignaciones();
    }

    public void updateAsignacion(Asignacion asignacion) {
        delegateAsignacion.updateAsignacion(asignacion);
    }

    public void deleteAsignacion(Asignacion asignacion) {
        delegateAsignacion.deleteAsignacion(asignacion);
    }

}
    
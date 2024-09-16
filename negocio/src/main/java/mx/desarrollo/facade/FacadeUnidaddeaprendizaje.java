/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import java.util.List;
import mx.SUAP.entidad.UnidadesDeAprendizaje;
import mx.desarrollo.delegate.DelegateUnidadesDeAprendizaje;

/**
 *
 * @author issac
 */
public class FacadeUnidaddeaprendizaje {
    
    private final DelegateUnidadesDeAprendizaje delegateUnidaddeaprendizaje;
    
    public FacadeUnidaddeaprendizaje() {
        this.delegateUnidaddeaprendizaje = new DelegateUnidadesDeAprendizaje();
    }
    
    public void guardarUnidaddeaprendizaje(UnidadesDeAprendizaje unidaddeaprendizajes){
        delegateUnidaddeaprendizaje.saveUnidaddeaprendizaje(unidaddeaprendizajes);
    }
    
    public void updateUnidadDeAprendizaje(UnidadesDeAprendizaje unidad) {
        delegateUnidaddeaprendizaje.updateUnidadDeAprendizaje(unidad);
    }

    public void deleteUnidadDeAprendizaje(UnidadesDeAprendizaje unidad) {
        delegateUnidaddeaprendizaje.deleteUnidadDeAprendizaje(unidad);
    }

    public List<UnidadesDeAprendizaje> findAllUnidadesDeAprendizaje() {
        return delegateUnidaddeaprendizaje.findAllUnidadesDeAprendizaje();
    }

    public UnidadesDeAprendizaje findUnidadDeAprendizajeById(Integer id) {
        return delegateUnidaddeaprendizaje.findUnidadDeAprendizajeById(id);
    }   
}

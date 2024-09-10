/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import java.util.List;
import mx.SUAP.entidad.UnidadDeAprendizaje;
import mx.desarrollo.delegate.DelegateUnidaddeaprendizaje;

/**
 *
 * @author issac
 */
public class FacadeUnidaddeaprendizaje {
    
    private final DelegateUnidaddeaprendizaje delegateUnidaddeaprendizaje;
    
    public FacadeUnidaddeaprendizaje() {
        this.delegateUnidaddeaprendizaje = new DelegateUnidaddeaprendizaje();
    }
    
    public void guardarUnidaddeaprendizaje(UnidadDeAprendizaje unidaddeaprendizajes){
        delegateUnidaddeaprendizaje.saveUnidaddeaprendizaje(unidaddeaprendizajes);
    }
    
    public void updateUnidadDeAprendizaje(UnidadDeAprendizaje unidad) {
        delegateUnidaddeaprendizaje.updateUnidadDeAprendizaje(unidad);
    }

    public void deleteUnidadDeAprendizaje(UnidadDeAprendizaje unidad) {
        delegateUnidaddeaprendizaje.deleteUnidadDeAprendizaje(unidad);
    }

    public List<UnidadDeAprendizaje> findAllUnidadesDeAprendizaje() {
        return delegateUnidaddeaprendizaje.findAllUnidadesDeAprendizaje();
    }

    public UnidadDeAprendizaje findUnidadDeAprendizajeById(Integer id) {
        return delegateUnidaddeaprendizaje.findUnidadDeAprendizajeById(id);
    }   
}

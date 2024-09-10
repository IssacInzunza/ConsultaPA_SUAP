/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import java.util.List;
import mx.desarrollo.integracion.ServiceLocator;
import mx.SUAP.entidad.UnidadDeAprendizaje;
/**
 *
 * @author issac
 */
public class DelegateUnidaddeaprendizaje {
    
    public void saveUnidaddeaprendizaje(UnidadDeAprendizaje unidaddeaprendizaje){
        ServiceLocator.getInstanceUnidadDeAprendizajeDAO().save(unidaddeaprendizaje);
    }
    
    public void updateUnidadDeAprendizaje(UnidadDeAprendizaje unidadDeAprendizaje) {
        ServiceLocator.getInstanceUnidadDeAprendizajeDAO().update(unidadDeAprendizaje);
    }

    public void deleteUnidadDeAprendizaje(UnidadDeAprendizaje unidadDeAprendizaje) {
        ServiceLocator.getInstanceUnidadDeAprendizajeDAO().delete(unidadDeAprendizaje);
    }

    public List<UnidadDeAprendizaje> findAllUnidadesDeAprendizaje() {
        return ServiceLocator.getInstanceUnidadDeAprendizajeDAO().findAll();
    }

    public UnidadDeAprendizaje findUnidadDeAprendizajeById(Integer id) {
        return ServiceLocator.getInstanceUnidadDeAprendizajeDAO().find(id);
    }
}

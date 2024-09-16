/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import java.util.List;
import mx.desarrollo.integracion.ServiceLocator;
import mx.SUAP.entidad.UnidadesDeAprendizaje;
/**
 *
 * @author issac
 */
public class DelegateUnidadesDeAprendizaje {
    
    public void saveUnidaddeaprendizaje(UnidadesDeAprendizaje unidaddeaprendizaje){
        ServiceLocator.getInstanceUnidadDeAprendizajeDAO().save(unidaddeaprendizaje);
    }
    
    public void updateUnidadDeAprendizaje(UnidadesDeAprendizaje unidadDeAprendizaje) {
        ServiceLocator.getInstanceUnidadDeAprendizajeDAO().update(unidadDeAprendizaje);
    }

    public void deleteUnidadDeAprendizaje(UnidadesDeAprendizaje unidadDeAprendizaje) {
        ServiceLocator.getInstanceUnidadDeAprendizajeDAO().delete(unidadDeAprendizaje);
    }

    public List<UnidadesDeAprendizaje> findAllUnidadesDeAprendizaje() {
        return ServiceLocator.getInstanceUnidadDeAprendizajeDAO().findAll();
    }

    public UnidadesDeAprendizaje findUnidadDeAprendizajeById(Integer id) {
        return ServiceLocator.getInstanceUnidadDeAprendizajeDAO().find(id);
    }
}

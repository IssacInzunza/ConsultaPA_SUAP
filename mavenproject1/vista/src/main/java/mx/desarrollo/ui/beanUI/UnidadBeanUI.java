/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui.beanUI;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.SUAP.entidad.UnidadesDeAprendizaje;
import mx.SUAP.helper.UnidadHelper;

/**
 *
 * @author issac
 */
@ManagedBean
@ViewScoped
public class UnidadBeanUI {
    private final UnidadHelper helper;
    private List<UnidadesDeAprendizaje> unidades;
    private UnidadesDeAprendizaje unidaddeaprendizajeSeleccionado;
    
    public UnidadBeanUI() {
        helper = new UnidadHelper();
        this.unidades = helper.getlistUnidades();
    }
    
     public List<UnidadesDeAprendizaje> getUnidades() {
        return unidades;
    }
    
    public void setProfesorSeleccionado(UnidadesDeAprendizaje unidaddeaprendizajeSeleccionado) {
        this.unidaddeaprendizajeSeleccionado = unidaddeaprendizajeSeleccionado;
    }
}

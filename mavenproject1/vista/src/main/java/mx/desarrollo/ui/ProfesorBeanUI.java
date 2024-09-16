
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.SUAP.entidad.Profesores;
import mx.desarrollo.helper.ProfesorHelper;
/**
 *
 * @author jesus
 */
@ManagedBean
@ViewScoped
public class ProfesorBeanUI implements Serializable{
    private final ProfesorHelper helper;
    private List<Profesores> profesores;
    private Profesores profesorSeleccionado; // Atributo para el profesor seleccionado
    
    public ProfesorBeanUI() {
        helper = new ProfesorHelper();
        this.profesores = helper.getlistProfesores();
    }
    
    public List<Profesores> getProfesores() {
        return profesores;
    }
    
    public void setProfesorSeleccionado(Profesores profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }
    
     public void modificarProfesorDesdeFormulario() {
        if (profesorSeleccionado != null) {
            helper.updateProfesor(profesorSeleccionado); 
            this.profesores = helper.getlistProfesores();
        }
    }



     public void eliminarProfesor() {
        if (profesorSeleccionado != null) {
            helper.deleteProfesor(profesorSeleccionado);
            this.profesores = helper.getlistProfesores();
        }
     }
     
}

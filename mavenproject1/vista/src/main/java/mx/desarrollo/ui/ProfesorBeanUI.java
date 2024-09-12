
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
    private final List<Profesores> profesores;
    
    public ProfesorBeanUI() {
        // Inicializamos la instancia de profesorHelper
        helper = new ProfesorHelper();
        
        // Obtenemos la lista de profesores usando el helper
        this.profesores = helper.getlistProfesores();
    }
    
    
    // Getter para la lista de profesores
    public List<Profesores> getProfesores() {
        return profesores;
    }
     
}

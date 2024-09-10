/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;

import mx.desarrollo.facade.FacadeAsignacion;
import mx.desarrollo.facade.FacadeProfesores;
import mx.desarrollo.facade.FacadeUnidaddeaprendizaje;


/**
 *
 * @author EduardoCardona <>
 */
public class ServiceFacadeLocator {
    
    private static FacadeAsignacion facadeAsignacion;
    private static FacadeProfesores facadeProfesores;
    private static FacadeUnidaddeaprendizaje facadeUnidaddeaprendizaje;
    
    public static FacadeAsignacion getInstanceFacadeAsignacion() {
        if (facadeAsignacion == null) {
            facadeAsignacion = new FacadeAsignacion();
        }
        return facadeAsignacion;
    }
    
    public static FacadeProfesores getInstanceFacadeProfesores() {
            if (facadeProfesores == null) {
                facadeProfesores = new FacadeProfesores();
            }
            return facadeProfesores;
        }
    
    public static FacadeUnidaddeaprendizaje getInstanceFacadeUnidadDeAprendizaje() {
        if (facadeUnidaddeaprendizaje == null) {
            facadeUnidaddeaprendizaje = new FacadeUnidaddeaprendizaje();
        }
        return facadeUnidaddeaprendizaje;
    }
    
    
}

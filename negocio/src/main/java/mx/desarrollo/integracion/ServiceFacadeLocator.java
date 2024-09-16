/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;

import java.io.Serializable;
import mx.desarrollo.facade.FacadeAdministradores;
import mx.desarrollo.facade.FacadeHorarios;

import mx.desarrollo.facade.FacadeProfesores;
import mx.desarrollo.facade.FacadeUnidaddeaprendizaje;
import mx.desarrollo.facade.FacadeUsuarios;

/**
 *
 * @author EduardoCardona <>
 */
//este cambio podria arruinar todo
public class ServiceFacadeLocator {

    private static FacadeProfesores facadeProfesores;
    private static FacadeUnidaddeaprendizaje facadeUnidaddeaprendizaje;
    private static FacadeAdministradores facadeAdministradores;
    private static FacadeUsuarios facadeUsuarios;
    private static FacadeHorarios facadeHorarios;

    public static FacadeProfesores getInstanceFacadeProfesores() {
        if (facadeProfesores == null) {
            facadeProfesores = new FacadeProfesores();
        }
        return facadeProfesores;
    }

    public static FacadeUnidaddeaprendizaje getInstanceFacadeUnidadDeAprendizaje() {
        if (facadeUnidaddeaprendizaje == null) {
            facadeUnidaddeaprendizaje = new FacadeUnidaddeaprendizaje();
        }//aaahh
        return facadeUnidaddeaprendizaje;
    }
    
     public static FacadeAdministradores getInstanceFacadeAdministradores() {
        if (facadeAdministradores == null) {
            facadeAdministradores = new FacadeAdministradores();
        }//aaahh
        return facadeAdministradores;
    }
     
     public static FacadeHorarios getInstanceFacadeHorarios() {
        if (facadeHorarios == null) {
            facadeHorarios = new FacadeHorarios();
        }//aaahh
        return facadeHorarios;
    }
     
      public static FacadeUsuarios getInstanceFacadeUusuarios() {
        if (facadeUsuarios == null) {
            facadeUsuarios = new FacadeUsuarios();
        }//aaahh
        return facadeUsuarios;
    }
}

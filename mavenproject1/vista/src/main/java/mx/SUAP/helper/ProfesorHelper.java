/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.SUAP.helper;

import java.io.Serializable;
import java.util.List;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.UnidadesDeAprendizaje;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author jesus
 */
public class ProfesorHelper implements Serializable{
    
    public void deleteProfesor(Profesores profesor) {
        ServiceFacadeLocator.getInstanceFacadeProfesores().deleteProfesores(profesor);
    }
    
    public List<Profesores> getlistProfesores() {
        return ServiceFacadeLocator.getInstanceFacadeProfesores().findAllProfesores();
    }
    
    public void updateProfesor(Profesores profesor){
        ServiceFacadeLocator.getInstanceFacadeProfesores().updateProfesores(profesor);
    }
    
    /**
    public List<UnidadesDeAprendizaje> findUnidadesByProfesor(Profesores profesor){
        return ServiceFacadeLocator.getInstanceFacadeUnidadDeAprendizaje().findUnidadesByProfesor(profesor.getIdProfesor());
    }
    * */
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;

import mx.desarrollo.DAO.AsignacionDAO;
import mx.desarrollo.DAO.ProfesoresDAO;
import mx.desarrollo.DAO.UnidadDeAprendizajeDAO;


/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static AsignacionDAO asignacionDAO;
    private static ProfesoresDAO profesoresDAO;
    private static UnidadDeAprendizajeDAO unidaddeprendizajeDAO;

    /**
     * se crea la instancia para alumno DAO si esta no existe
     */
    public static AsignacionDAO getInstanceAsignacionDAO(){
        if(asignacionDAO == null){
            asignacionDAO = new AsignacionDAO();
            return asignacionDAO;
        } else{
            return asignacionDAO;
        }
    }
    /**
     * se crea la instancia de usuarioDAO si esta no existe
     */
    public static ProfesoresDAO getInstanceProfesoresDAO(){
        if(profesoresDAO == null){
            profesoresDAO = new ProfesoresDAO();
            return profesoresDAO;
        } else{
            return profesoresDAO;
        }
    }
    
    public static UnidadDeAprendizajeDAO getInstanceUnidadDeAprendizajeDAO(){
        if(unidaddeprendizajeDAO == null){
            unidaddeprendizajeDAO = new UnidadDeAprendizajeDAO();
            return unidaddeprendizajeDAO;
        } else{
            return unidaddeprendizajeDAO;
        }
    }
    
}

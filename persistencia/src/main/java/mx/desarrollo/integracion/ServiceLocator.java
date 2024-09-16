/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.integracion;


import mx.desarrollo.DAO.AdministradoresDAO;
import mx.desarrollo.DAO.HorarioDAO;
import mx.desarrollo.DAO.ProfesoresDAO;
import mx.desarrollo.DAO.UnidadesDeAprendizajeDAO;
import mx.desarrollo.DAO.UsuariosDAO;


/**
 *
 * @author total
 */
public class ServiceLocator {
    
    private static ProfesoresDAO profesoresDAO;
    private static UnidadesDeAprendizajeDAO unidaddeprendizajeDAO;
    private static AdministradoresDAO administradoresDAO;
    private static UsuariosDAO usuariosDAO;
    private static HorarioDAO horarioDAO;
    /**
    
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
    
    public static UnidadesDeAprendizajeDAO getInstanceUnidadDeAprendizajeDAO(){
        if(unidaddeprendizajeDAO == null){
            unidaddeprendizajeDAO = new UnidadesDeAprendizajeDAO();
            return unidaddeprendizajeDAO;
        } else{
            return unidaddeprendizajeDAO;
        }
    }
    /**
     * Obtiene la instancia de AdministradoresDAO si no existe una, crea una nueva instancia.
     * @return Instancia de AdministradoresDAO.
     */
    public static AdministradoresDAO getInstanceAdministradoresDAO() {
        if (administradoresDAO == null) {
            administradoresDAO = new AdministradoresDAO();
        }
        return administradoresDAO;
    }

    /**
     * Obtiene la instancia de UsuariosDAO si no existe una, crea una nueva instancia.
     * @return Instancia de UsuariosDAO.
     */
    public static UsuariosDAO getInstanceUsuariosDAO() {
        if (usuariosDAO == null) {
            usuariosDAO = new UsuariosDAO();
        }
        return usuariosDAO;
    }

    /**
     * Obtiene la instancia de HorarioDAO si no existe una, crea una nueva instancia.
     * @return Instancia de HorarioDAO.
     */
    public static HorarioDAO getInstanceHorarioDAO() {
        if (horarioDAO == null) {
            horarioDAO = new HorarioDAO();
        }
        return horarioDAO;
    }
    
}

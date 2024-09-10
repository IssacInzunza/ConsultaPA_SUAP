/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;

import java.util.List;
import mx.desarrollo.integracion.ServiceLocator;
import mx.SUAP.entidad.Profesores;
/**
 *
 * @author issac
 */
public class DelegateProfesores {
    
    public void saveProfesores(Profesores profesores){
        ServiceLocator.getInstanceProfesoresDAO().save(profesores);
    }
    
    public void updateProfesores(Profesores profesor) {
        ServiceLocator.getInstanceProfesoresDAO().update(profesor);
    }

    public boolean deleteProfesores(Profesores profesor) {
        //Profesores profesores = new Profesores();
        List<Profesores> prof = ServiceLocator.getInstanceProfesoresDAO().findAll();
        for(Profesores pro:prof){
            if(pro.getNombre().equalsIgnoreCase(profesor.getNombre())){
                //profesores = pro;
                ServiceLocator.getInstanceProfesoresDAO().delete(pro);
                return true;
            }
        }
        return false;
    }

    public List<Profesores> findAllProfesores() {
        return ServiceLocator.getInstanceProfesoresDAO().findAll();
    }

    public Profesores findProfesorById(Integer id) {
        return ServiceLocator.getInstanceProfesoresDAO().find(id);
    }
    
    /*public Profesores findProfesorById(String nombre) {
        return ServiceLocator.getInstanceProfesoresDAO().find(nombre);
    }*/
}

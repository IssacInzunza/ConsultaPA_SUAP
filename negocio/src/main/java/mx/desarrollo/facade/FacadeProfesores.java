/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import java.util.List;
import mx.desarrollo.delegate.DelegateProfesores;
import mx.SUAP.entidad.Profesores;
/**
 *
 * @author issac
 */
public class FacadeProfesores {
    private final DelegateProfesores delegateProfesores;
    
    public FacadeProfesores() {
        this.delegateProfesores = new DelegateProfesores();
    }
    
    public void guardarProfesores(Profesores profesores){
        delegateProfesores.saveProfesores(profesores);
    }
    
    public void updateProfesores(Profesores profesores) {
        delegateProfesores.updateProfesores(profesores);
    }

    public void deleteProfesores(Profesores profesores) {
        delegateProfesores.deleteProfesores(profesores);
    }

    public List<Profesores> findAllProfesores() {
        return delegateProfesores.findAllProfesores();
    }

    public Profesores findProfesoresById(Integer id) {
        return delegateProfesores.findProfesorById(id);
    }
    
    /*public Profesores getProfesorByNombre(String nombre) {
        return delegateProfesores.buscar(nombre);
    }*/
    
}

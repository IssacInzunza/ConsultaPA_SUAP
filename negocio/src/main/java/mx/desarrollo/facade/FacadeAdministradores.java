/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;
import mx.desarrollo.delegate.DelegateAdministradores;
import mx.SUAP.entidad.Administradores;
import java.util.List;
/**
 * dsds
 * @author Johan
 */
public class FacadeAdministradores {
    private final DelegateAdministradores delegateAdministradores;
    
    public FacadeAdministradores() {
        this.delegateAdministradores = new DelegateAdministradores();
    }
    
    public void guardarAdministradores(Administradores administradores){
        delegateAdministradores.saveAdministradores(administradores);
    }
    
    public void updateAdministradores(Administradores administradores) {
        delegateAdministradores.updateAdministradores(administradores);
    }

    public void deleteAdministradores(Administradores administradores) {
        delegateAdministradores.deleteAdministradores(administradores);
    }

    public List<Administradores> findAllAdministradores() {
        return delegateAdministradores.findAllAdministradores();
    }

    public Administradores findAdministradoresById(Integer id) {
        return delegateAdministradores.findAdministradorById(id);
    }
}
